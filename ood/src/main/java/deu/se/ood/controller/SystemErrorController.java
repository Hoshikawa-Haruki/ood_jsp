/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController; // spring-boot 에서 지원하는 기능. spring 에서는 지원 X
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * errorPage 없이 처리하는 방법.
 * @author 915-11
 */
@Controller
@Slf4j
// 사용하지 않을 경우, 클래스 자체를 없애야함!
// ErrorController를 구현하기만 해도 Spring Boot는 기본 에러 처리기(BasicErrorController)를 비활성화함.

public class SystemErrorController implements ErrorController{
    
    @RequestMapping("/error") // 일방적인 방법. getmapping 과 기능은 동일
    public String errorPage(HttpServletRequest request, RedirectAttributes attrs) {
        Integer status = (Integer)request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE); // 에러코드를 가져옴
        String uri = request.getRequestURI();
        log.debug(uri);
        attrs.addFlashAttribute("msg", "오류가 발생하여 컨텍스트 루트로 이동하였습니다. 오류코드 = " + status.toString());
        return "redirect:/"; // == response.sendRedirect("/");
    }
}
