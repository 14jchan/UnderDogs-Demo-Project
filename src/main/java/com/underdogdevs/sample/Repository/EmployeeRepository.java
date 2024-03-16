package com.underdogdevs.sample.Repository;

import com.underdogdevs.sample.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    EmployeeEntity findByID(Integer ID);

    EmployeeEntity findByFirstName(String firstName);

    List<EmployeeEntity> deleteAllByFirstNameIgnoreCaseAndLastNameIgnoreCaseOrderByID(String firstName, String lastName);

    List<EmployeeEntity> findByFirstNameIgnoreCaseAndLastNameIgnoreCaseOrderByID(String firstName, String lastName);
}
