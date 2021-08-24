package com.mapping.onetomany.Service;

import com.mapping.onetomany.BaseResponse.BaseResponse;
import com.mapping.onetomany.DTO.AddressDTO;
import com.mapping.onetomany.DTO.EmployeeDTO;
import com.mapping.onetomany.DTO.listDto;
import com.mapping.onetomany.Entity.Address;
import com.mapping.onetomany.Entity.Employee;
import com.mapping.onetomany.Repository.AddressRepository;
import com.mapping.onetomany.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;



    public BaseResponse det(EmployeeDTO employeeDTO) {
        Employee employee=new Employee();
        BaseResponse baseResponse=new BaseResponse();
        employee.setEmpName(employeeDTO.getEmpName());
        employee.setEmpAge(employeeDTO.getEmpAge());
        employeeRepository.save(employee);
        employeeDTO.getAddressDTO().stream().forEachOrdered(addressDTO -> {
            Address address = new Address();
            address.setCity(addressDTO.getCity());
            address.setPincode(addressDTO.getPincode());
            address.setEmployee(employee);
            addressRepository.save(address);
        });
        baseResponse.setData(employeeDTO);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        return baseResponse;
    };

    public List<Address> listAll() {
        return addressRepository.findAll();
    }
    public Address getEmployeeById(long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public BaseResponse deletedetail(long id) {
        BaseResponse baseResponse = new BaseResponse();
        employeeRepository.deleteById(id);
        baseResponse.setData(id);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        return baseResponse;
    }

    public BaseResponse deleted(){
        BaseResponse baseResponse = new BaseResponse();
        employeeRepository.deleteAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        return baseResponse;
    }
    public BaseResponse updatedetail(EmployeeDTO employeeDTO) {
        Employee existemployee = employeeRepository.findById(employeeDTO.getEmpId()).orElse(null);
        BaseResponse baseResponse=new BaseResponse();
        existemployee.setEmpName(employeeDTO.getEmpName());
        existemployee.setEmpAge(employeeDTO.getEmpAge());
        employeeRepository.save(existemployee);
        employeeDTO.getAddressDTO().stream().forEachOrdered(addressDTO -> {
            Address existaddress = addressRepository.findById(addressDTO.getAddressId()).orElse(null);
            existaddress.setCity(addressDTO.getCity());
            existaddress.setPincode(addressDTO.getPincode());
            existaddress.setEmployee(existemployee);
            addressRepository.save(existaddress);
        });
        baseResponse.setData(employeeDTO);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        return baseResponse;
    }







}
