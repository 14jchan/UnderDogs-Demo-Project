package com.underdogdevs.sample.Repository;

import com.underdogdevs.sample.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    EmployeeEntity findByID(Integer ID);

    EmployeeEntity findByFirstName(String firstName);

}
