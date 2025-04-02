/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String ch04IncludeTest2() {
        log.debug("ch04IncludeTest2() is called...");
        return "ch04/includeTest2/index";
    }
}
