/*===================================================================
 * System Name : spring-webflux-demo
 * Version     : 1.0.0
 * Create Date :  2019/09/11 17:14:37
 * Description :  Create By tien-dung
 * Coppy Right (c) 2015 - 2019 By org.springframework.springwebflux.demo.config All Rights Reserved.	
 ====================================================================*/
package org.springframework.springwebflux.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
 
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
 
@Configuration
@EnableReactiveMongoRepositories(basePackages = "com.howtodoinjava.demo.dao")
public class MongoConfig extends AbstractReactiveMongoConfiguration
{  
    @Value("${port}")
    private String port;
     
    @Value("${dbname}")
    private String dbName;
 
    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }
 
    @Override
    protected String getDatabaseName() {
        return dbName;
    }
 
    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
    }
}