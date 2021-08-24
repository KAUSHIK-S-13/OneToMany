package com.mapping.onetomany.Controller;

import com.mapping.onetomany.BaseResponse.BaseResponse;
import com.mapping.onetomany.DTO.EmployeeDTO;
import com.mapping.onetomany.Entity.Address;
import com.mapping.onetomany.Entity.Employee;
import com.mapping.onetomany.Repository.EmployeeRepository;
import com.mapping.onetomany.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee_detail")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService obj;

    @PostMapping("/emp")
    public BaseResponse det(@RequestBody EmployeeDTO employeeDTO) {
        return obj.det(employeeDTO);
    }

    @GetMapping("/getAll")
    public List<Address> list(){
        return obj.listAll();
    }
    @GetMapping("/employeebyid/{id}")
    public Address findEmployeeById(@PathVariable int id) {
        return obj.getEmployeeById(id);
    }

    @DeleteMapping("/Delete/{id}")
    public BaseResponse deletedetail(@PathVariable int id) {
        return obj.deletedetail(id);
    }

    @DeleteMapping("/deletall")
    public BaseResponse deleted( ){
        return obj.deleted();
    }
    @PutMapping("/Update")
    public BaseResponse updatedetail(@RequestBody EmployeeDTO employeeDTO) {
        return obj.updatedetail(employeeDTO);
    }




}
