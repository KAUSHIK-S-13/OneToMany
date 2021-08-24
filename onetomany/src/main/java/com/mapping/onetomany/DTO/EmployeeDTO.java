package com.mapping.onetomany.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class EmployeeDTO {

    private long empId;

    private String empName;

    private Integer empAge;

    private List<AddressDTO> addressDTO;

}
