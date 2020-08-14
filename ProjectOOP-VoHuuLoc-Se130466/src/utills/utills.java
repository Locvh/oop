/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utills;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class utills {
    Scanner sc=new Scanner(System.in);
    static Scanner t = new Scanner (System.in);
    public static int getInt (String msg, String err1, String err2,String err3){
        System.out.println(msg);
        String result;
        int number;
        while (true){
            result= t.nextLine();
            if (result.isEmpty()){
                System.out.println(err1);
            }
            else {
                try{
                    number=Integer.parseInt(result);
                    if (number <0){
                        System.out.println(err3);
                    }
                    else {
                        return number;
                    }
                }catch (NumberFormatException e){
                    System.out.println(err2);
                }
            }
        }
    }
 public static int getFloat (String msg, String errorException, String errorNull){
       
        String result;
        int number;
        while (true){
             System.out.println(msg);
            result= t.nextLine();
            if (result.isEmpty()){
                System.out.println(errorNull);
            }
            else {
                try{
                    number=Integer.parseInt(result);
                        return number;
                    
                }catch (NumberFormatException e){
                    System.out.println(errorException);
                }
            }
        }
    }
  
public static String getString (String msg, String ans1, String ans2,String err){
        System.out.println(msg);
        String result="";      
        while (true){
            
                try{
                   result=t.nextLine();
                   if (result.compareToIgnoreCase(ans1)==0|| result.compareToIgnoreCase(ans2)==0){
                       return  result;
                       
                    }
                   else System.out.println(err);
                }catch (NumberFormatException e){
                   
                }
            }
        }
public static String getString (String msg, String err){
        
        String result;      
do{
    System.out.println(msg);
    result =t.nextLine().trim();
    if (result.compareTo("")==0 || result.startsWith(" ")==true){
        System.out.println(err);
    }
}while(result.compareTo("")==0||result.compareTo(" ")==0);
    return result;

        }


    }
