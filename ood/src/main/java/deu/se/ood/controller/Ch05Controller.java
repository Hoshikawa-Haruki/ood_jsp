/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Haruki
 */
@Controller
@Slf4j
public class Ch05Controller {

    @RequestMapping("ch05/eltest")
    public String ch05Eltest() {
        log.debug("ch05Eltest() is called...");
        return "ch05/eltest/index";
    }

    /**
     *
     * @param number 1..3
     * @return
     */
    @GetMapping("ch05/simpletagtest/{number}")
    public String simpleTagTest(@PathVariable Integer number) {
        return String.format("ch05/simpletagtest/index%d", number);
    }

    @GetMapping("ch05/elimplicitobject")
    public String ch05ELImplictObjectTest() {
        return ("ch05/ELImplicitObjectTest/index");
    }
}
