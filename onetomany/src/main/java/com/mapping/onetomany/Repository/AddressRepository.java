package com.mapping.onetomany.Repository;

import com.mapping.onetomany.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
/*    List<Address> findByEmployeeId(long employeeId);*/

    List<Address> findByEmployee(long id);

 /*   List<Address> findByEmployeeId(long employeeId);*/
}

