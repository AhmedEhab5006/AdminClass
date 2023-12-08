
package com.mycompany.coursemsystem;

import java.io.File;
import java.util.Scanner;

public class CheckAdmin
{

    public  void  chkAdmin(String Email , String Pass ) throws Exception 
   {
      
     
    File AdminData = new File ("C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\AdminData");
    Scanner data = new Scanner(AdminData);
    while (data.hasNextLine())
    {
      if (data.nextLine().equals(Email))
      {
          if (data.nextLine().equals(Pass))
          {
              System.out.println("true");
              System.out.println("=====================================");
              //action which done when Admin is Exist in File (((True)))
              ShowMenu task = new ShowMenu();
              task.AdminMenu();
              int ch = task.TaskCasenumber();
              AdminTaskCases p =new  AdminTaskCases(ch);
              p.openchiose(ch);
               
          }
          else
          {
              System.out.println("False");  
          }
            
      }
      
    
    }
}
}
