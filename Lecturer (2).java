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
public class Lecturer extends Degree {
    private String forenames;
    private String surname;
    private long emailAddress;
    
        public Lecturer(){
            super();
        }
        
        public Lecturer(String forenames,String surname,long emailAddress){
            this.forenames = forenames;
            this.surname = surname;
            this.emailAddress = emailAddress;
            
        }
        // getter
        
        public String getForenames(){
            return forenames;
        }
        public String getSurname(){
            return surname;
        }
        public long getEmailAddress(){
            return emailAddress;
        }
        // setters
        public void setForenames(String forenames){
            this.forenames = forenames;
        }
        public void setSurname(String surname){
            this.surname = surname;
        }
        public void setEmailAddress(long emailAddress){
            this.emailAddress = emailAddress;
            
        }
        
        @Override
        public String toString(){
            return super.toString()+ ",Forenames = " + forenames + ", Surname = " + surname + ", Email-Address = " + emailAddress;
        } 
        public void show(){
            System.out.println(super.toString());
            System.out.println(toString());
            
        }
}
