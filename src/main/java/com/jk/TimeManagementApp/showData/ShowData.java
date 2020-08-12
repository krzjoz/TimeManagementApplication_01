package com.jk.TimeManagementApp.showData;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jk.TimeApplicationApp.repository.ToDoListRepository;
import com.jk.TimeManagmentApp.dao.ToDoListEntity;


@Component
public class ShowData {
	
	private ToDoListRepository todolistrepository;
	
	@Autowired
	public ShowData(ToDoListRepository todolistrepository) {
		this.todolistrepository = todolistrepository;
		loadData();
	}

	public void loadData() {
		todolistrepository.save(new ToDoListEntity("taskName", "category", "taskDescription", "taskStatus"));
		todolistrepository.save(new ToDoListEntity("taskName", "category", "taskDescription", "taskStatus"));
		todolistrepository.save(new ToDoListEntity("taskName", "category", "taskDescription", "taskStatus"));
		todolistrepository.save(new ToDoListEntity("taskName", "category", "taskDescription", "taskStatus"));
		//because of JpaRepository

	}
}
