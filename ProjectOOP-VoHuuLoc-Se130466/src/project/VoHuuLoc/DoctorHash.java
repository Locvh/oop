/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.VoHuuLoc;

import java.util.ArrayList;
import java.util.Scanner;
import utills.utills;

/**
 *
 * @author Admin
 */
public class DoctorHash extends ArrayList<Doctor>{
    Scanner sc=new Scanner(System.in);
    utills u=new utills();
    public boolean find(String aCode){
        for(int i=0;i<this.size();i++){
            if(aCode.equalsIgnoreCase(this.get(i).getCode())){
                return true;
            }       
    }return false;
}
    public boolean findname(String aCode){
        for(int i=0;i<this.size();i++){
            if(aCode.contains(this.get(i).getName())){
                return true;
            }       
    }return false;
}
    
    public void add() throws Exception{
        if (this.size() >50){
            throw new Exception("full.");
        }else {
            String  newCode,NewName,newSpecialization;
            int newAvailability;    
            do{
                newCode=u.getString("Enter doctor's new code:", "");             
                if(find(newCode)){
                    System.out.println("this code existed.");
                }
            }while (find(newCode));
            NewName=u.getString("Enter doctor's new name:", "");
            newSpecialization=u.getString("Enter doctor's new Specialization:", "");
            newAvailability=u.getInt("please input Availability", "you input is null ", "you must input an integer ", "please input an integer than 0");
            Doctor d=new Doctor(newCode, NewName, newSpecialization, newAvailability);
            this.add(d);
            System.out.println("New doctor has been added succesfull");
        }
    }
    public void update() {
        if (this.isEmpty()){
            System.out.println("null");
        }else{
            String  newCode=null;
            String NewName,newSpecialization;
            int newAvailability;
            do{
                newCode=u.getString("Enter doctor's update code:", "");             
                if(!find(newCode)){
                    System.out.println("this code existed.");
                }
            }while (!find(newCode));
                System.out.println("Enter code's new name:");
                NewName=sc.nextLine();
                System.out.println("Enter code's new Specialization");
                newSpecialization=sc.nextLine();               
                System.out.println("Enter code's new Availability");
                newAvailability=Integer.parseInt(sc.nextLine());
               for(int i=0;i<this.size();i++){
               if(this.get(i).getCode().equalsIgnoreCase(newCode)){
                   if(!(NewName.equals(""))){
                       this.get(i).setName(NewName);
                   }
                   else if(!(newSpecialization.equals(""))){
                       this.get(i).setSpecialization(newSpecialization);
                   }
                   else if(newAvailability!=0){
                       this.get(i).setAvailability(newAvailability);
                   }                   
               }       
               }
                System.out.println("Doctor"+ newCode+"was update");
            }        
    }
    public void remove(){     
          if (this.isEmpty()){
            System.out.println("null");
        }else{
             String newCode;              
                newCode=u.getString("Enter doctor's new code:", "");                            
            if (find(newCode)){
            for(int i=0;i<this.size();i++){
                if(this.get(i).getCode().equalsIgnoreCase(newCode)){
                    this.remove(i);  
                }       System.out.println("Information Removed");
         }
            }else if (find(newCode)==false){
                    System.out.println("this isn't existed.");
                }      
    }
    }
public void Sreach(){
      if (this.isEmpty()){
            System.out.println("null");
        }else{
    String aName;
    aName=u.getString("Enter doctor's Name search", "null");
    if (findname(aName)){
         for (int i=0;i<this.size();i++){
       if (this.get(i).getName().toUpperCase().contains(aName.toUpperCase())){            
            System.out.println(String.format("%4s|%5s|%4s|%3d|",this.get(i).getCode(),this.get(i).getName(),this.get(i).getSpecialization(),this.get(i).getAvailability()));          
        }
    }   
    }else {
        System.out.println("not found doctor");  
    }  
}}
}
