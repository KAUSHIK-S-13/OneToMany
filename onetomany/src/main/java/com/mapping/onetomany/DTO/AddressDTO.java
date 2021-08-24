package com.mapping.onetomany.DTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AddressDTO {

    private long addressId;

    private String city;

    private Integer pincode;

}
