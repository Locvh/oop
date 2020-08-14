/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.VoHuuLoc;

/**
 *
 * @author Admin
 */
public class Menu {
    String[] arr;
    int n=0;
    public Menu(int size){
        arr=new String[size];
    }
    public void add(String code){
        if(n<arr.length){
            arr[n++]=code;
        }
    }
    public int getChoice(){
        int rs=0;
        if(n>0){
            for(int i=0 ; i<n;i++){
                System.out.println(i+1+"-"+arr[i]);
            }
            rs=utills.utills.getInt("please input choice 1-4", "you input is null ", "you must input an integer ", "please input an integer than 0");
        }
        return rs;
    }
}
