package benmoncast.com.todo_app.repository;



import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import benmoncast.com.todo_app.todo.Todo;
import jakarta.annotation.PostConstruct;

import java.time.LocalDate;
import java.util.*;


@Repository

public class TodoRepository {
 private final Map<Integer, Todo> todoMap = new HashMap<>();
 private int currentId = 1;

 public List<Todo> findAll() {
     return new ArrayList<>(todoMap.values());
 }

 public Todo findById(int id) {
     return todoMap.get(id);
 }

 public void save(Todo todo) {
     if (todo.getId() == 0) {
         todo.setId(currentId++);
     }
     todoMap.put(todo.getId(), todo);
 }

 public void deleteById(int id) {
     todoMap.remove(id);
 }
 
 @PostConstruct
 public void init() {
     save(new Todo(0, "Write Docs", "Write project documentation", "Benedict", LocalDate.now().plusDays(3), "In Progress"));
     save(new Todo(0, "Fix Bugs", "Fix login form bugs", "Alex", LocalDate.now().plusDays(5), "Not Started"));
     save(new Todo(0, "Deploy App", "Deploy the app to server", "Chris", LocalDate.now().plusDays(7), "Completed"));
 }
}

	