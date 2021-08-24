package com.mapping.onetomany.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long empId;

    @Column(name = "employeename")
    private String empName;

    @Column(name = "employeeage")
    private Integer empAge;

}
