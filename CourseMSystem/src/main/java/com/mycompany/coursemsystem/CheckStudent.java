
package com.mycompany.coursemsystem;

import java.io.File;
import java.util.Scanner;

public class CheckStudent 
{
   
    
     public  void  chkStudent(String Email , String Pass ) throws Exception 
   {
     File StudentData = new File ("C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\StudentData");

    Scanner Stddata = new Scanner(StudentData);
    Scanner Stddata2= new Scanner(StudentData);
    
    while (Stddata.hasNextLine())
    {
      if (Stddata.nextLine().equals(Email))
      {
          if (Stddata.nextLine().equals(Pass))
          {
              System.out.println("true");
              System.out.println("=====================================");
              //action which done when Student is Exist in File (((True)))
          }
          else
          {
              System.out.println("False");  
          }
            
      }
      

    }
   }
    
}
