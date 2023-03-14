package com.lab7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("studentService")
public class studentService {

	@Autowired
	studentRepository repo;
	public void Save(int id, String name)
	{
		student s = new student();
		s.setId(id);
		s.setName(name);
		repo.save(s);
	}
	
	public void update(int id, String name)
	{
		student s = new student();
		s.setId(id);
		s.setName(name);
		repo.save(s);
	}
	
	public void delete(int id)
	{
		student s = new student();
		s.setId(id);
		repo.delete(s);
	}
	
	public List<student> getStudList()
	{
		List<student> allStud = (List<student>) repo.findAll();
		return allStud;
	}
}
