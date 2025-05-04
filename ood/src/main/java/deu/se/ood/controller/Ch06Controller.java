/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Haruki
 */
@Controller
@Slf4j
public class Ch06Controller {

    @GetMapping("ch06/showtable1")
    public String ch06Showtable1() {
        log.debug("● ch06Showtable1 is called...");
        return "ch06/ShowTable1/index";
    }

    @GetMapping("ch06/showtable2")
    public String ch06Showtable2() {
        log.debug("● ch06Showtable2 is called...");
        return "ch06/ShowTable2/index";
    }

}
