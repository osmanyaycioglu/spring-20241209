package org.training.capital.microservice.spring20241209.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.training.capital.microservice.spring20241209.sevices.models.Employee;

import java.util.List;
import java.util.concurrent.Future;

// @Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    // select * from employee e where e.name=? order by e.surname
    // select e from Employee e where e.name=? order by e.surname
    Future<List<Employee>> findByNameOrderBySurname(String name);

    List<Employee> findByHeightBetweenAndWeightBetween(Integer minH,
                                                       Integer maxH,
                                                       Integer minW,
                                                       Integer maxW);

    @Query("select e from Employee e where e.name=?1 order by e.surname")
    List<Employee> searchName(String name);

    @Query("select e from Employee e where e.name=?1 and e.surname=?2 order by e.surname")
    List<Employee> searchNameAndSurname(String name,String surname);

    @Query("select e from Employee e where e.name=:name and e.surname=:sur order by e.surname")
    List<Employee> searchNameAndSurname2(@Param("name") String name,@Param("sur") String surname);

    @Query("select e.name,e.surname from Employee e where e.name=?1 and e.surname=?2 order by e.surname")
    List<Object[]> searchNameAndSurname3(String name,String surname);

    @Query("select new org.training.capital.microservice.spring20241209.data.NameInfo(e.name,e.surname) from Employee e where e.name=?1 and e.surname=?2 order by e.surname")
    List<NameInfo> searchNameAndSurname4(String name,String surname);

    @Query(value = "select * from employee e where e.name=?1 order by e.surname",nativeQuery = true)
    List<Employee> searchNameNative(String name);

}
