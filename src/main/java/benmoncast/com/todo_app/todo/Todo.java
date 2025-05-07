package benmoncast.com.todo_app.todo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Size;

public class Todo {
	    private int id;
	    private String name;
	    private String description;
	    private String personInCharge;
	    private LocalDate targetDate;
	    private String status;
		public Todo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Todo(int id, String name, String description, String personInCharge, LocalDate targetDate,
				String status) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.personInCharge = personInCharge;
			this.targetDate = targetDate;
			this.status = status;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPersonInCharge() {
			return personInCharge;
		}
		public void setPersonInCharge(String personInCharge) {
			this.personInCharge = personInCharge;
		}
		public LocalDate getTargetDate() {
			return targetDate;
		}
		public void setTargetDate(LocalDate targetDate) {
			this.targetDate = targetDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", personInCharge="
					+ personInCharge + ", targetDate=" + targetDate + ", status=" + status + "]";
		}

}
