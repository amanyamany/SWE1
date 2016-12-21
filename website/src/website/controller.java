/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package website;

/**
 *
 * @author Mostafa
 */
public class controller {
    
   website_db model= new website_db();
  //  View view= new View();

    public controller(website_db M) //View V)
    {
        this.model=M;
       // this.view=V;
    }

    boolean validateSignIn(String userName, String password)
    {
        boolean found=false;
        for(int i=0; i<model.users.size(); i++)
        {
            String name=model.users.get(i).name;
            String pass=model.users.get(i).password;
          //  System.out.println("welcome"+name+pass);
            if(name.equals(userName) && pass.equals(password))
            { 
                found=true;
                 break;
            }
        }
        return found;
    }

    boolean validateCreatAccount(String userName)
    {
        boolean found=false;
        for(int i=0; i<model.users.size(); i++)
        {
            String name=model.users.get(i).name;
            String pass=model.users.get(i).password;
            if(userName.equals(name))
                found=true;
        }
        return  found;
    }

    void creatAccount(String userName, String password , String eMail)
    {
        User newUser= new User();
        newUser.name=userName;
        newUser.password=password;
        newUser.eMail=eMail;

        model.users.add(newUser);
    }



    
}
