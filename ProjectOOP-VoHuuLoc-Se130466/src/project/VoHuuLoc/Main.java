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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DoctorHash dh=new DoctorHash();
       Menu m=new Menu(5);
       m.add("Add");
       m.add("Update");
       m.add("Remove");
       m.add("Search");
       m.add("Exit");
       int choice;
       do{
           choice =m.getChoice();
           switch (choice){
               case 1:
                   try{
                       dh.add();
                       break;
                   }catch (Exception e){
                       System.out.println(e.getMessage());
                       
                   }break;
               case 2:
                 
                       dh.update();
                       break;
                  
               case 3:
                       dh.remove();
                       break;
                   
               case 4:
                       dh.Sreach();
                       break;
                   
               case 5:
                   System.out.println("Exit ");
                   System.exit(0);
           }
       }while (choice!=5);
       
    }
    
}
