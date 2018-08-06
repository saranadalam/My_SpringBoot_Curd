package com.springcrud.practice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.practice.bean.StudentBaen;
import com.springcrud.practice.entity.StudentEntity;
import com.springcrud.practice.service.StudentService;

@RestController
public class Student {
	@Autowired
	StudentService s;
	StudentEntity se;
	
	
	
	@PutMapping(value="/api/insert")
	public StudentEntity insert(@RequestBody StudentBaen bean)
	{
		StudentEntity insert = s.insert(bean);
		
		System.out.println("Inserted");
		return insert;
	}
	
	@PutMapping(value="/api/findall")
    
	public List<StudentEntity> findAll()
	{		
		List<StudentEntity> wholeData=s.findAll();
		
		return wholeData;
		
	}
	@PutMapping(value="/api/delete")
	public String delete(@PathVariable("id") String id,@RequestBody StudentBaen bean)
	{
		System.out.println("Delete Starts in controller");
		String delete = s.delete(id,bean);
			return delete;
		
	}
    @PutMapping(value="/api/update/{id}")
    public StudentEntity update(@PathVariable String id,@RequestBody StudentBaen sb)
 {
	
	StudentEntity update = s.update(id,sb);
	
	System.out.println(update);
	return update;
	
 }
	
	
	
	
	
	
}
