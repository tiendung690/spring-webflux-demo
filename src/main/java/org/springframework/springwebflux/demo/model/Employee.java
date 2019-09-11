/*===================================================================
 * System Name : spring-webflux-demo
 * Version     : 1.0.0
 * Create Date :  2019/09/11 17:14:48
 * Description :  Create By tien-dung
 * Coppy Right (c) 2015 - 2019 By org.springframework.springwebflux.demo.model All Rights Reserved.	
 ====================================================================*/
package org.springframework.springwebflux.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
public class Employee {
 
    @Id
    int id;
    String name;
    long salary;
 
    //Getters and setters
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
