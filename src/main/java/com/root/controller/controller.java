package com.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.root.model.Employe;
import com.root.service.EmployeServiceI;

@RestController
public class controller 
{
	@Autowired 
	EmployeServiceI empSI;
	
	@PostMapping("/")
	public Employe createEmp(@RequestBody Employe emp)
	{
		return this.empSI.addEmp(emp);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAll()
	{
		return ResponseEntity.ok(this.empSI.getAllEmp());
		
	}
	
	@PutMapping("/")
	public Employe updateEmp(@RequestBody Employe emp)
	{
		return empSI.updateEmp(emp);
	}
	
	@DeleteMapping("/{Id}")
	public void deleteEmp(@PathVariable ("Id") Integer Id)
	{
		empSI.deleteEmp(Id);
	}

}
