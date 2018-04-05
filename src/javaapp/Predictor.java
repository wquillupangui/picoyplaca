/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Washington
 */
public class Predictor {
    
    private List<Restriction> lstRestriction;
    private LocalDate ldNow;
    private LocalTime ltNow;
    
    public void initRestrictions(){
        lstRestriction=new ArrayList<>();
        lstRestriction.add(new Restriction(1, "07:00", "09:00", Arrays.asList(1,2)));
        lstRestriction.add(new Restriction(1, "16:00", "19:30", Arrays.asList(1,2)));
        lstRestriction.add(new Restriction(2, "07:00", "09:00", Arrays.asList(3,4)));
        lstRestriction.add(new Restriction(2, "16:00", "19:30", Arrays.asList(3,4)));
        lstRestriction.add(new Restriction(3, "07:00", "09:00", Arrays.asList(5,6)));
        lstRestriction.add(new Restriction(3, "16:00", "19:30", Arrays.asList(5,6)));
        lstRestriction.add(new Restriction(4, "07:00", "09:00", Arrays.asList(7,8)));
        lstRestriction.add(new Restriction(4, "16:00", "19:30", Arrays.asList(7,8)));
        lstRestriction.add(new Restriction(5, "07:00", "09:00", Arrays.asList(9,0)));
        lstRestriction.add(new Restriction(5, "16:00", "19:30", Arrays.asList(9,0)));
    }
    
    public String checkPlate(String strPlate){
        Plate plt0=new Plate(strPlate);
        this.initRestrictions();
        int intNum=Integer.valueOf(plt0.getLastDigit());
        LocalDate ld0 = ( ldNow==null ? LocalDate.now() : ldNow);        
        int intDay=ld0.getDayOfWeek().getValue();
        LocalTime lt0=( ltNow==null ? LocalTime.now() : ltNow);           
        long lngRest=lstRestriction.stream()
                .filter(obj0 -> obj0.getLastDigit().contains(intNum) && obj0.getDayofWeek()==intDay) 
                .filter(obj1 ->{ 
                    LocalTime ltInit= LocalTime.parse(obj1.getInitHour());
                    LocalTime ltEnd= LocalTime.parse(obj1.getEndHour());
                    return lt0.isAfter(ltInit) && lt0.isBefore(ltEnd);                            
                }).count();
        if (lngRest==0) {
            return "Ride";
        }
        return "Not Ride";
    }

    public LocalDate getLdNow() {
        return ldNow;
    }

    public void setLdNow(LocalDate ldNow) {
        this.ldNow = ldNow;
    }

    public LocalTime getLtNow() {
        return ltNow;
    }

    public void setLtNow(LocalTime ltNow) {
        this.ltNow = ltNow;
    }
    
    

    public List<Restriction> getLstRestriction() {
        return lstRestriction;
    }

    public void setLstRestriction(List<Restriction> lstRestriction) {
        this.lstRestriction = lstRestriction;
    }
    
    
}
