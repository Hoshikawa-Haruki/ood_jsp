/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Haruki
 */
@Controller
@Slf4j
public class Ch04Controller {

    @RequestMapping("ch04/forward")
    public String ch04Forward() {
        log.debug("ch04Forward() is called...");
        return "ch04/forward/index";
    }

    @GetMapping("ch04/scripting")
    public String ch04Scripting() {
        log.debug("ch04Scripting() is called...");
        return "ch04/scripting/index";
    }

    @GetMapping("ch04/include")
    public String ch04Include() {
        log.debug("ch04Include() is called...");
        return "ch04/includeTest2/index";
    }
    
    @GetMapping("ch04/beans")
    public String ch04Beans() {
        log.debug("ch04Beans() is called...");
        return "ch04/beans/index";
    }

    @PostMapping("ch04/showsum")
    public String ch04ShowSum() {
        log.debug("ch04ShowSum() is called...");
        return "ch04/beans/show_sum";
    }
}
