package org.training.capital.microservice.spring20241209.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.training.capital.microservice.spring20241209.rest.models.EmployeeDto;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

@Mapper
public interface IEmployeeMapper {

    IEmployeeMapper EMPLOYEE_MAPPER = Mappers.getMapper(IEmployeeMapper.class);

    Employee toEmployee(EmployeeDto employee);

    EmployeeDto toEmployeeDto(Employee employee);
}
