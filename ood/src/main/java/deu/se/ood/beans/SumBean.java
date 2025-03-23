/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.beans;

/**
 *
 * @author 915-11
 */
public class SumBean {

    private int n;
    private int result; // 프로퍼티의 애트리뷰트

    public SumBean() {
        result = 0;
    }

    public void calculate() {
        result = n * (n + 1) / 2;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int getResult() {
        return result;
    }

}
