/*===================================================================
 * System Name : spring-webflux-demo
 * Version     : 1.0.0
 * Create Date :  2019/09/11 17:14:51
 * Description :  Create By tien-dung
 * Coppy Right (c) 2015 - 2019 By org.springframework.springwebflux.demo.service All Rights Reserved.	
 ====================================================================*/
package org.springframework.springwebflux.demo.service;

import org.springframework.springwebflux.demo.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface IEmployeeService
{
    void create(Employee e);
     
    Mono<Employee> findById(Integer id);
 
    Flux<Employee> findByName(String name);
 
    Flux<Employee> findAll();
 
    Mono<Employee> update(Employee e);
 
    Mono<Void> delete(Integer id);
}