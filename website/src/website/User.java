/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package website;

import java.util.ArrayList;

/**
 *
 * @author Mostafa
 */
public class User {
    String name;
    int aga;
    char gender;
    int score;
    //////////////////////////////
    
    // String userName="";
    String eMail="";
    String password="";
   // ArrayList<game> Games= new ArrayList<>();
    /////////////////////////////////
    
    
    
    
    public  void set_name(String s)
    {
        name=s;
    }
     public  void set_age(int s)
    {
        aga=s;
    }
     public  void set_gender(char s)
    {
        gender=s;
    }
     
    public String get_name()
     {return name;
     
     }
    
    public int get_age()
     {return aga;
     
     }
    
    public char get_gender()
     {return gender;
     }
    
     
     
     
}
