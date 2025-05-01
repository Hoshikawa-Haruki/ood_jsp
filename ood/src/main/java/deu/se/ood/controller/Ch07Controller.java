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
public class Ch07Controller {

    @GetMapping("ch07/upload")
    public String ch07Upload() {
        log.debug("ch07Upload() is called...");
        return "ch07/FileUpload2/index";
    }

    @GetMapping("ch07/download")
    public String ch07Download() {
        log.debug("ch07Download() is called...");
        return "ch07/FileDownload/index";
    }
}
