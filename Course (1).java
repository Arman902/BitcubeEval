/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rununiversity;

/**
 *
 * @author Armand Nziza (217035019)
 */
public class Course extends Degree{
    private String CourseName;
    private int CourseDurationInMonths;
    
    public Course(){
    super();
    }
            

            public Course(String CourseName,int CourseDurationInMonths){
                this.CourseName = CourseName;
                this.CourseDurationInMonths = CourseDurationInMonths;
                
            }
            public String getCourseName(){
                return CourseName;
            }
           public void setCourseName(String CourseName){
               this.CourseName = CourseName;
           }
           public int getCourseDurationInMonths(){
               return CourseDurationInMonths;
           }
           public void setCourseDurationInMonths(int CourseDurationInMonths){
               this.CourseDurationInMonths = CourseDurationInMonths;
               
           }
           @Override
           public String toString(){
               return super.toString() + "CourseName = " + CourseName + ",Course Duration In Months = " + CourseDurationInMonths;
            
           }
           public void Show(){
                   System.out.print(this.CourseName);
                   System.out.print(this.CourseDurationInMonths);
                    System.out.print(super.toString());
               }
            
}
