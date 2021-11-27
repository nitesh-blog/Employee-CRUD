package com.root.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.root.model.Employe;
import com.root.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeServiceI {

	@Autowired
	EmployeRepository emprepo;
	
	@Override
	public Employe addEmp(Employe emp) {
		
		return emprepo.save(emp) ;
	}

	@Override
	public List<Employe> getAllEmp() {
		
		return emprepo.findAll();
	}

	@Override
	public Employe updateEmp(Employe emp) {
		
		return emprepo.save(emp);
	}

	@Override
	public void deleteEmp(Integer Id) {
		Employe emp= new Employe();
		emp.setId(Id);
		emprepo.delete(emp);
		
	}
	
	

}
