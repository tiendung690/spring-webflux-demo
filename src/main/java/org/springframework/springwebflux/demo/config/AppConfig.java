/*===================================================================
 * System Name : spring-webflux-demo
 * Version     : 1.0.0
 * Create Date :  2019/09/11 17:14:37
 * Description :  Create By tien-dung
 * Coppy Right (c) 2015 - 2019 By org.springframework.springwebflux.demo.config All Rights Reserved.	
 ====================================================================*/
package org.springframework.springwebflux.demo.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
 
@Configuration
public class AppConfig
{
    @Bean
    public static PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer()
    {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("application.properties"));
        ppc.setIgnoreUnresolvablePlaceholders(true);
        return ppc;
    }
}