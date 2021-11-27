package com.root.service;

import java.util.List;

import com.root.model.Employe;

public interface EmployeServiceI {
	//create
	public Employe addEmp(Employe emp);
	//getall
	public List<Employe> getAllEmp();
	//update
	public Employe updateEmp(Employe emp);
	//delete
	public void deleteEmp(Integer Id);

}