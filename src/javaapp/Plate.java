/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author Washington
 */
public class Plate {
    
    private String number;

    public Plate(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getLastDigit(){
        return this.number.substring(this.number.length()-1);
    }
}
