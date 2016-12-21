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
public class game {
    
    String name;
    int category;
    int leve;
    int num_player;
    ArrayList<game_code>arr;
    public game() {
    }
   
    void set_name(String n)
    {
    name=n; 
    
    }
    String get_name(){
    return name;
    
    }
     void play()
    {System.out.println(name+"Game is playing");}
    
    
}
