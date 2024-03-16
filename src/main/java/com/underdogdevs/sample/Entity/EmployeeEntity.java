package com.underdogdevs.sample.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import java.util.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer ID;
    @Column(name = "firstName", columnDefinition = "varchar(320)")
    @NonNull
    String firstName;
    @Column(name = "lastName", columnDefinition = "varchar(320)")
    @NonNull
    String lastName;
    @Column(name = "dob", columnDefinition = "datetime")
    Date dob;
}
