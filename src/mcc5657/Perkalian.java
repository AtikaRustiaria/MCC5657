/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcc5657;

/**
 *
 * @author User
 */
public class Perkalian {
    
    private int a;
    private int b;

    public Perkalian() {
    }

    public Perkalian(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
    public int hasilPerkalian(){
        return this.a * this.b;
    }
    
    
}
