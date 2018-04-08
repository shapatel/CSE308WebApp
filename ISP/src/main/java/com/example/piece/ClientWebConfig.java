/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Thomas
 */
@EnableWebMvc
@Configuration
public class ClientWebConfig extends WebMvcConfigurerAdapter {
 
   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
      super.addViewControllers(registry);
 
      registry.addViewController("/textlog.html");
   }
 
   @Bean
   public ViewResolver viewResolver() {
      InternalResourceViewResolver bean = new InternalResourceViewResolver();
 
      bean.setViewClass(JstlView.class);
      bean.setPrefix("/web/WEB-INF/views/");
      bean.setSuffix(".jsp");
 
      return bean;
   }
}