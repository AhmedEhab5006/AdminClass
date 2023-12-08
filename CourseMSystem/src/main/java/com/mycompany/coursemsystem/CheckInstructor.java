
package com.mycompany.coursemsystem;

import java.io.File;
import java.util.Scanner;

public class CheckInstructor
{
  
    public  void  chkInstructor(String Email3 , String Pass3 ) throws Exception 
   {
       
    File instructorData = new File ("C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\InstructorData");
    
    Scanner instdata = new Scanner(instructorData);
    Scanner instdata2 = new Scanner(instructorData);
    while (instdata.hasNextLine())
    {
      if (instdata.nextLine().equals(Email3))
      {
          if (instdata.nextLine().equals(Pass3))
          {
              System.out.println("true");
              System.out.println("=====================================");
              //action which done when Instructor is Exist in File (((True)))
          }
          else
          {
              System.out.println("False");  
          }
            
      }
      

    }
      
    
}
}
