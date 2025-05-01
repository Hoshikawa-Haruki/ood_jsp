/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.config;

import deu.se.ood.ch07.file_upload.Upload2Servlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

/**
 *
 * @author Haruki
 */
@Configuration
public class UploadServletBeans {

    @Bean
    public ServletRegistrationBean<Upload2Servlet> upload2ServletRegistration(){
         // Upload2Servlet 인스턴스를 등록하고, 매핑 URL 지정
        ServletRegistrationBean<Upload2Servlet> registration = new ServletRegistrationBean<>(new Upload2Servlet());
        registration.addUrlMappings("/ch07/FileUpload2/upload2.do");
        return registration;
    }
}
