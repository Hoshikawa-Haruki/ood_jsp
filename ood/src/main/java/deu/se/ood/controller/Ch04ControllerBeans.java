/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import deu.se.ood.beans.ch04.SumSpringBean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Haruki
 */
@Controller
@Slf4j
public class Ch04ControllerBeans {

    @Autowired
    private ServletContext ctx;
    @Autowired
    private SumSpringBean sumBean;

    @GetMapping("ch04/beans")
    public String ch04Beans(Model m) { // url 파라미터 처리
        log.debug("Real path of \"/\" = {}", ctx.getRealPath("/")); // 실제 애플리케이션이 실행되고 있는 경로
        m.addAttribute("ctx_path", ctx.getRealPath("/"));  // model 에 값을 보내주면, index의 ctx에서 출력 가능
        return "ch04/beans/index";
    }

    @PostMapping("/ch04/beans/show_sum1")
    public String ch04BeansShowSum1(HttpServletRequest request) {
        log.debug("show_sum: n = {}", request.getParameter("n"));
        return "ch04/beans/show_sum1";
    }

    @PostMapping("ch04/beans/show_sum2")
    public String ch04ShowSum2(@RequestParam String n, Model model) {
        log.debug("show_sum2: n = {}", n);
        sumBean.setN(Integer.parseInt(n));
        sumBean.calculate();
        model.addAttribute("result", sumBean.getResult());
        return "ch04/beans/show_sum2";
    }
}
