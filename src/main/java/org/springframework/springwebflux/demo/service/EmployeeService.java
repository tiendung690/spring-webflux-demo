/*===================================================================
 * System Name : spring-webflux-demo
 * Version     : 1.0.0
 * Create Date :  2019/09/11 17:14:51
 * Description :  Create By tien-dung
 * Coppy Right (c) 2015 - 2019 By org.springframework.springwebflux.demo.service All Rights Reserved.	
 ====================================================================*/
package org.springframework.springwebflux.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.springwebflux.demo.dao.EmployeeRepository;
import org.springframework.springwebflux.demo.model.Employee;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@Service
public class EmployeeService implements IEmployeeService {
     
    @Autowired
    EmployeeRepository employeeRepo;
 
    public void create(Employee e) {
        employeeRepo.save(e).subscribe();
    }
 
    public Mono<Employee> findById(Integer id) {
        return employeeRepo.findById(id);
    }
 
    public Flux<Employee> findByName(String name) {
        return employeeRepo.findByName(name);
    }
 
    public Flux<Employee> findAll() {
        return employeeRepo.findAll();
    }
 
    public Mono<Employee> update(Employee e) {
        return employeeRepo.save(e);
    }
 
    public Mono<Void> delete(Integer id) {
        return employeeRepo.deleteById(id);
    }
 
}