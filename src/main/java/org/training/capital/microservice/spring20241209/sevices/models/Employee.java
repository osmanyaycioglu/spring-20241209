package org.training.capital.microservice.spring20241209.sevices.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private Long            employeeId;
    @Column(name = "name", nullable = false)
    @NotNull
    private String          name;
    @NotEmpty
    private String          surname;
    @NotNull
    private String          phoneNumber;
    private String          department;
    @Max(500)
    @Min(10)
    private Integer         weight;
    @Max(300)
    @Min(50)
    private Integer         height;
    @Enumerated(EnumType.STRING)
    private EEmployeeStatus employeeStatus = EEmployeeStatus.ACTIVE;
    private ZonedDateTime   creationTime;
    private ZonedDateTime   updateTime;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private EmployeeExtra employeeExtra;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "employee")
    private List<EmployeePhone> employeePhones;


    @PrePersist
    // @PreRemove
    public void beforeInsert() {
        creationTime = ZonedDateTime.now();
    }

    @PreUpdate
    public void beforeUpdate() {
        updateTime = ZonedDateTime.now();
    }

    @PostPersist
    @PostRemove
    @PostUpdate
    @PostLoad
    public void after() {
        System.out.println("Db işlemi yapıldı");
    }

}
