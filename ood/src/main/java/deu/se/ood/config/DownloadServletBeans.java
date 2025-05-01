/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.config;

import deu.se.ood.ch07.file_download.DownloadServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

/**
 *
 * @author Haruki
 */
@Configuration
public class DownloadServletBeans {

    @Bean
    public ServletRegistrationBean<DownloadServlet> downloadServletRegistration() {
        // DownloadServlet 인스턴스를 등록하고, 매핑 URL 지정
        ServletRegistrationBean<DownloadServlet> registration = new ServletRegistrationBean<>(new DownloadServlet());
        registration.addUrlMappings("/ch07/FileDownload/download.do");
        return registration;
    }
}