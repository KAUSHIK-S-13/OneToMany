package com.mapping.onetomany.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class listDto {
    private long empId;

    private String empName;

    private Integer empAge;

    private List<AddressDTO> addressDTO;
}
