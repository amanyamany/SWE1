/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package website;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class game_controller {
    
    public String read (String file_name) throws FileNotFoundException, IOException     //////////////READ CONTENT OF FILE
  {FileReader file=new  FileReader(file_name);
  String result=new String(); 
 BufferedReader br = new BufferedReader(file);
   /* for (String line; (line = br.readLine()) != null;) {
        System.out.println(line);*/
  String line =null;
  while ((line = br.readLine()) != null) {
      result+=line; 
   }
  return result;
  
}
    
    website_db model= new website_db();
 //   View view= new View();

    public game_controller(website_db M)// View V)
    {
        this.model=M;
      //  this.view=V;
    }
public void write ( String d, String filename) throws IOException 
  {
      File file=new File(filename);
        FileWriter filew=new FileWriter(file);
         try (BufferedWriter bw = new BufferedWriter(filew)) {
             bw.newLine();
             
             bw.write(d);
             
         }
 
  
  }
    
     

public game create_game()
{
    Scanner scannar=new Scanner(System.in);
 game gme=new game();
 //System.out.println("choose category name:");
                
        System.out.println("1-math");
        System.out.println("2-program");
        System.out.println("3-science");
        /////////////////////////////////////////////////////
        System.out.println("entre catagorynum :");
       int h=scannar.nextInt(); 
       gme.category=h-1;
        System.out.println("entr game name:");
        gme.name=scannar.next();
       System.out.println("entre your game:");
       String d=scannar.next();
            // control_game.create_game(pass);
ArrayList<game_code>p=new ArrayList<>();
    String[] r=new String[2];
     //String[] r1=new String[2];
    
     r=d.split(",");
     for(int i=0;i<r.length;i++)
     {
     String[] r1=new String[2];
     //System.out.println(r[0]);
      r1=r[i].split("/");
      game_code play=new game_code();
      play.question=r1[0];
      play.result=r1[1];
      p.add(play);
     }
     
gme.arr=p;


return gme;///;///////////////////////////////should be return game

}
   public void save(game g) 
    {
        model.category.get(g.category).add(g);
       System.out.println("done");
       
    }
    public  void play_game( )
    {Scanner s=new Scanner(System.in);
     System.out.println("1-math");
     System.out.println("2-program");
     System.out.println("3-science");
     
    int choice=s.nextInt();
    int score=0;
   for(int i=0;i<  model.category.get(choice-1).size();i++)
   {
   System .out.println(model.category.get(choice-1).get(i).name);
   
   }
     System.out.println("enter choice:");
     int  name=s.nextInt();
     ArrayList<game_code>arr1;
      arr1=model.category.get(choice-1).get(name).arr;
       System.out.println("enter t or f");
    for(int i=0;i<  arr1.size();i++)
   {
   System.out.println(arr1.get(i).question);
   
   String c=s.next();
   if(c.equals(arr1.get(i).result)){
       score++;
   System.out.println("well done");
   
   }
   else{
   
   System.out.println("wrong answer");
   }
   
   }
        System.out.println("your score is:"+score);
    }
    ////////////////////////////////////////////////
     
 



    
}
