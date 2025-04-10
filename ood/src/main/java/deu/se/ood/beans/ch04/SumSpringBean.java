/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.beans.ch04;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author 915-11
 */
@Component // spring bean 정의 어노테이션. 자동으로 생성되어서 스프링 부트가 연결시켜주는 역할 -> autoWired로 연결됨!
@Slf4j
public class SumSpringBean {

    @Getter
    @Setter
    private int n;
    @Getter
    private int result;

    public SumSpringBean() {
        log.debug("The instance SumSpringBean created...");
        result = 0;
    }

    public void calculate() {
        result = n * (n + 1) / 2;
    }
}
