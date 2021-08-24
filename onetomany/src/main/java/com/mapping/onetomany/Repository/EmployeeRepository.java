package com.mapping.onetomany.Repository;

import com.mapping.onetomany.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {



}
