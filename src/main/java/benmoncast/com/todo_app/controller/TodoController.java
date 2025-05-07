package benmoncast.com.todo_app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import benmoncast.com.todo_app.repository.TodoRepository;
import benmoncast.com.todo_app.todo.Todo;

@Controller
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @GetMapping("/")
    public String listTodos(Model model) {
        model.addAttribute("todos", repository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "form";
    }

    @PostMapping("/save")
    public String saveTodo(@ModelAttribute Todo todo) {
        repository.save(todo);
        return "redirect:/";
    }
       
    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable int id, Model model) {
        model.addAttribute("todo", repository.findById(id));
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}
