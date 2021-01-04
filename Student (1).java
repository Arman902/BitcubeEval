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
public class Student extends Degree{
    
    private String forenames;
    private  String surname;
    private long EmailAddress;
    private int DateOfBirth;
    
    public Student(){
        super();
    }
    
        public Student(String forenames,String surname,long EmailAddress,int DateOfBirth){
            this.forenames = forenames;
            this.surname = surname;
            this.EmailAddress = EmailAddress;
            this.DateOfBirth = DateOfBirth;
            
                    
        }
        public String getForenames(){
            return forenames;
        }
        
        public void setForenames(String forenames){
            this.forenames = forenames;
        }
        
        public String getSurname(){
            return surname;
        }
        public void setSurname(String surname){
            this.surname = surname; 
        }
        
        public long getEmailAddress(){
            return EmailAddress;
        }
        public void setEmailAddress(long EmailAddress){
            this.EmailAddress = EmailAddress;
        }
        
        public int getDateOfBirth(){
            return DateOfBirth;
        }
        public void setDateOfBirth(int DateOfBirth){
            this.DateOfBirth = DateOfBirth;
        }
             @Override
               public String toString(){
                   return super.toString() + "Name = " + forenames + ",SURNAME = " + surname + ",EMAIL-ADDRESS = " + EmailAddress + " ,Date Of Birth = " + DateOfBirth;
               }
               public void show (){
System.out.println("Student Details");
System.out.println("Name" +  this.forenames);
System.out.println("Surname" +  this.surname);
System.out.println("EmailAddress" +  this.EmailAddress);
System.out.println("DateOfBirth" +  this.DateOfBirth);
               }
    }

