package org.training.capital.microservice.spring20241209.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.training.capital.microservice.spring20241209.rest.models.EmployeeDto;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

import java.util.List;

@Mapper
public interface IEmployeeMapper {

    IEmployeeMapper EMPLOYEE_MAPPER = Mappers.getMapper(IEmployeeMapper.class);
    @Mapping(source = "extra",target = "employeeExtra")
    Employee toEmployee(EmployeeDto employee);

    @Mapping(target = "extra",source = "employeeExtra")
    EmployeeDto toEmployeeDto(Employee employee);

    @Mapping(source = "extra",target = "employeeExtra")
    List<Employee> toEmployees(List<EmployeeDto> employee);

    @Mapping(target = "extra",source = "employeeExtra")
    List<EmployeeDto> toEmployeeDtos(List<Employee> employee);
}



