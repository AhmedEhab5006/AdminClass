
package com.mycompany.coursemsystem;

import java.util.Scanner;

public class AdminTaskCases extends Person 
{
  private  final int x;

   public AdminTaskCases (int ch) 
    {
      this.x = ch;
    }
   
    
    public  void  openchiose(int ch) throws Exception
    {
        
        switch (ch) {
            case 1 ->                 
                {
                   System.out.println("======================================"); 
                   System.out.println("What You Want To Add......?\n "); 
                   ShowMenu body = new ShowMenu();
                   body.Print_What_ch();
                   int choise =body.Take_choise(); 
                   switch (choise)
                   {
                       case 1 ->
                       {
                         String FilePath="C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\StudentData"; 
                         Person ADDStudent= new Person();
                         ADDStudent.Add(FilePath);
                         System.out.println("======================");
                         System.out.println("Add Student Completed. ");
                         
                       }
                       case 2 ->
                       {
                          
                         String FilePath="C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\AdminData"; 
                         Person ADDAdmin= new Person();
                         ADDAdmin.Add(FilePath);
                         System.out.println("======================");
                         System.out.println("Add Admin Completed. ");
                           
                       }
                       case 3 ->
                       {
                         String FilePath="C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\InstructorData"; 
                         Person ADDInstructor= new Person();
                         ADDInstructor.Add(FilePath); 
                         System.out.println("======================");
                         System.out.println("Add Instructor Completed. ");
                             
                       }
                   }
                   
      
                }
            case 2 ->                 
                {
                    System.out.println("=================================");
                  System.out.println("What You Want To Update....?\n "); 
                  ShowMenu body = new ShowMenu();
                   body.Print_What_ch();
                   int choise =body.Take_choise(); 
                   switch (choise)
                   {
                       case 1 ->
                       {
                         String FilePath = "C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\StudentData";                  
                          Person StudentUpdate = new Person();
                          StudentUpdate.Update(FilePath);
                       }
                       case 2 ->
                       {
                         String FilePath = "C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\AdminData";
                           Person AdminUpdate= new Person();
                          AdminUpdate.Update(FilePath);
                           
                       }
                       case 3 ->
                       {
                          String FilePath = "C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\InstructorData";
                          Person InstructorUpdate = new Person();
                          InstructorUpdate.Update(FilePath);
                         
                       }
                   }
                
                }
            case 3 ->                
                {
                   System.out.println("================================"); 
                  System.out.println("What You Want To Delete \n"); 
                  ShowMenu body = new ShowMenu();
                   body.Print_What_ch();
                   int choise =body.Take_choise(); 
                   switch (choise)
                   {
                       case 1 ->
                       {
                         String FilePath = "C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\StudentData";
                       
                          Person StudentDelete = new Person();
                          StudentDelete.Delete(FilePath);
                       }
                       case 2 ->
                       {
                         String FilePath = "C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\AdminData";                     
                           Person AdminDelete= new Person();
                          AdminDelete.Delete(FilePath);
                           
                       }
                       case 3 ->
                       {
                          String FilePath = "C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\InstructorData";
                          Person InstructorDelete = new Person();
                          InstructorDelete.Delete(FilePath);
                         
                       }
                   }
                }
            case 4 -> {
                 System.out.println("System is Exist");
            }
            default -> {
                System.out.println("Please Enter number from 1 to 3 ");
            }
        }
  
  
    }  
    
}
