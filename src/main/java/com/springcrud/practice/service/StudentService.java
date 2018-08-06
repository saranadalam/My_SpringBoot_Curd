package com.springcrud.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.practice.bean.StudentBaen;
import com.springcrud.practice.entity.StudentEntity;
import com.springcrud.practice.repository.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	StudentEntity se;
	
	public StudentEntity insert(StudentBaen sb)
	{
		StudentEntity entity=new StudentEntity();
		
		entity.setSid(sb.getSid());
		entity.setSname(sb.getSname());
		entity.setSnumber(sb.getSnumber());
		
		sr.save(entity);

		return entity;		
	}
	public StudentEntity update(String id,StudentBaen bean)
	{
		System.err.println("comtroller to service");

		StudentEntity s=new StudentEntity();
		s.setSid(bean.getSid());
		s.setSname(bean.getSname());
		s.setSnumber(bean.getSnumber());
		StudentEntity update = sr.save(s);
		System.err.println("Set and save data");
		
     /* StudentBaen sb=new StudentBaen();
		se.setSid(sb.getSid());
		se.setSname(sb.getSname());
		se.setSnumber(sb.getSnumber());
		StudentEntity update = sr.save(se);
		System.out.println("set and save data");
	*/	
		return update;
	}
	public List<StudentEntity> findAll()
	{
	  
      List<StudentEntity> findAll = sr.findAll();		
		
		
		return findAll;
		
		
	}
	
	public String delete(String id,StudentBaen bean)
	{
	  sr.deleteById(Integer.parseInt(id));
		
		return null;
			
	}
	
	public List<StudentEntity>byid()
	{
			return null ;
	}
	
	}
