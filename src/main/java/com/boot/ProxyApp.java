package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.boot.filters.RequestLogFilter;

@EnableZuulProxy
@SpringBootApplication
public class ProxyApp extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ProxyApp.class, args);
    }
	
	  @Bean
	  public RequestLogFilter requestLogFilter() {
		return new RequestLogFilter();
	  }

}
