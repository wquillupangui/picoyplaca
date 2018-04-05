/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.List;

/**
 *
 * @author Washington
 */
public class Restriction {
    
    private Integer dayofWeek;
    private String initHour;
    private String endHour;
    private List<Integer> lastDigit; 

    public Restriction(Integer dayofWeek, String initHour, String endHour, List<Integer> lastDigit) {
        this.dayofWeek = dayofWeek;
        this.initHour = initHour;
        this.endHour = endHour;
        this.lastDigit = lastDigit;
    }

    
    
    public Integer getDayofWeek() {
        return dayofWeek;
    }

    public void setDayofWeek(Integer dayofWeek) {
        this.dayofWeek = dayofWeek;
    }

    public String getInitHour() {
        return initHour;
    }

    public void setInitHour(String initHour) {
        this.initHour = initHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public List<Integer> getLastDigit() {
        return lastDigit;
    }

    public void setLastDigit(List<Integer> lastDigit) {
        this.lastDigit = lastDigit;
    }
    
    
}
