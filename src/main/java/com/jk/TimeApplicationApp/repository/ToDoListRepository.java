package com.jk.TimeApplicationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jk.TimeManagmentApp.dao.ToDoListEntity;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoListEntity, Long> {
	
}
