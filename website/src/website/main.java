/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package website;

import com.sun.org.apache.bcel.internal.Constants;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Mostafa
 */
public class main {
    
         public static void main(String[] args) {
         website_db web=new website_db();
             ArrayList<game>r=new ArrayList<>();
             web.category.add(r);
         game f=new game();
       // web.category.get(0).add(f);
         User u1=new User();
         User u2=new User();
         u1.name="aya";
         u1.password="123";
         u1.eMail="aya@";
         u2.name="heba";
         u2.password="456";
         u2.eMail="heba@";
         web.users.add(u1);
         web.users.add(u2);
         ////////////////////////////////////////////
         
           Scanner s=new Scanner(System.in);
         
         
         
          game_controller control_game=new game_controller(web);
         
         controller c=new  controller(web);
         game g=new game();
          boolean exit=true;
         boolean flag1=false;            ///////////////user   f,teacher    t
                  
   //  while(exit){
        
      System.out.println("1-create account as student");
       System.out.println("2-create account as teacher :");
       System.out.println("3-login as student ");
       System.out.println("4-login as teacher ");
     System.out.println("5-exit");
     System.out.println("entre your choise:");
       
     int choise=s.nextInt();
     String name;
     String pass;
     String email;
     boolean flag;
     
     switch(choise){
      
     case(1):
     {
         
         flag1=true;
         
         do{
         System.out.println("enter user name:");
         name=s.next();
          System.out.println("enter user pass:");
          
         pass=s.next();
          System.out.println("enter user email:");
         
         email=s.next();
         
          
      flag=  c.validateCreatAccount(name);}while(flag==true);
     
     c.creatAccount(name, pass, email);
     
     break;
     }
     case (2):{
         flag1=false; 
     do{
         System.out.println("enter user name:");
         name=s.next();
          System.out.println("enter user pass:");
          
         pass=s.next();
          System.out.println("enter user email:");
         
         email=s.next();
         
          
      flag=  c.validateCreatAccount(name);}while(flag==true);
     
     if(email.contains("fci"))
     {
     c.creatAccount(name, pass, email);
     
     }
     else
     {
     
     System.out.println("you are not ateacher");
     }
     
     
     
     break;
     
     
     }
     
     
     
     
     case(3):
             { flag1=true;
              do{   System.out.println("enter user name:");
         name=s.next();
          System.out.println("enter user pass:");
          
         pass=s.next();
        flag= c.validateSignIn(name, pass);
         System.out.println(flag);
              }while(flag==false);
             
             System.out.println("welcome"+name);
             
             break;
             }
     case(4):{
     
     do{   System.out.println("enter user name:");
         name=s.next();
          System.out.println("enter user pass:");
          
         pass=s.next();
        flag= c.validateSignIn(name, pass);
        // System.out.println(flag);
              }while(flag==false);
             
             System.out.println("welcome"+name);
             
             break;
     
     
     }
     
     case (5):
     {
         flag=true;
         break;
     }
   
     }
  //   }
      ///////////////////////////////////////////////////////////////////////////////////
         if(flag1==true){
             boolean t=true;
             while(t){
          System.out.println("1-play game");
          System.out.println("2-logout");
          System.out.println("entre your choise:");
         
          int ch=s.nextInt();
             switch(ch){
             case(1):
             {
            //  game_controller g_c=new game_controller(web);
               control_game.play_game();
               
               break;
             }
             case(2):{
             
             t=false;
             break;
             }
           
         
         }}}
         
         else{
             boolean t=true;
         while(t){
              System.out.println("1-play game");
                 System.out.println("2-create game");
                  System.out.println("3-logout");
               System.out.println("entre your choise:");
          int ch=s.nextInt();
               switch(ch){
                   case(1):
                   {
                   control_game.play_game();
                     break;
                   }
             case(2):
             {
              control_game.save( control_game.create_game());
               break;
             }
             case(3):{
             
             t=false;
             break;
             }
            
                    }
           }
         }
             }
    
}




