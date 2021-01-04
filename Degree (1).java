/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rununiversity;

/**
 *
 * @author Armand Nziza  (217035019)
 */
public class Degree  {
    private String DegreeName;
    private int DegreeDurationInYears;
    
    public Degree(){
        
    }
    public Degree(String DegreeName,int DegreeDuration){
        this.DegreeDurationInYears = DegreeDuration;
        this.DegreeName = DegreeName;
    }
    public int getDegreeDurationInYears(){
        return DegreeDurationInYears;
    }
    public void setDegreeDurationInYears(int DegreeDurationInYears){
        this.DegreeDurationInYears = DegreeDurationInYears;
    }
    public String getDegreeName(){
        return DegreeName;
    }
    public void setDegreeName(String DegreeName){
        this.DegreeName = DegreeName;
    }
    @Override
    public String toString(){
        return "Degree Name = " + DegreeName + ",Degree Duration In Years = " + DegreeDurationInYears;
    }
}
