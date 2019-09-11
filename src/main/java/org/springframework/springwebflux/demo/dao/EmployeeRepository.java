/*===================================================================
 * System Name : spring-webflux-demo
 * Version     : 1.0.0
 * Create Date :  2019/09/11 17:14:45
 * Description :  Create By tien-dung
 * Coppy Right (c) 2015 - 2019 By org.springframework.springwebflux.demo.dao All Rights Reserved.	
 ====================================================================*/
package org.springframework.springwebflux.demo.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.springwebflux.demo.model.Employee;

import reactor.core.publisher.Flux;
 
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Employee> findByName(final String name);
}