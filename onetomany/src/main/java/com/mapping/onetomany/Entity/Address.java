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
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long addressId;

    @Column(name="city")
    private String city;

    @Column(name="pincode")
    private Integer pincode;

    @ManyToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
