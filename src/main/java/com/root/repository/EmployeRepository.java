package com.root.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.root.model.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer>
{

}
