package com.mycompany.coursemsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Person 
{
   //****************************************************************  
  //****************************(((Add)))******************************
      public void Add(String FilePath)
    {
       File Add = new File (FilePath);
                      
          try {
              
           try (FileWriter data = new FileWriter(Add, true) )
            {
                Scanner input = new Scanner(System.in);
                System.out.println("===================");
                System.out.println("Enter Email= ");
                String Username ;
                Username=input.nextLine();
                System.out.println("\nEnter Password= ");
                String Password ;
                Password=input.nextLine();
                data.append("\n");
                data.append(Username);
                data.append("\n");
                data.append(Password);
                
                data.close();
                
            }
            
        } catch (IOException ex) {
            System.out.println("Exception : " + ex.getMessage());
    
}
    }
 
 //****************************************************************  
 //****************************(((Update)))******************************
    
  public void Update(String FilePath) throws FileNotFoundException
    {
          
    
    //*******************************
    Scanner input = new Scanner(System.in);
    //*******************************
    System.out.println("===========================");
    System.out.println("Update Account......?");
    System.out.println("\nEnter Old  Email= ");
    String OldUsername ;
    OldUsername=input.nextLine();
    System.out.println("\nEnter Old Password= ");
    String OldPassword ;
    OldPassword=input.nextLine();
    //************************
    System.out.println("---------------");
    System.out.println("Enter New  Email= ");
    String NewName ;
    NewName=input.nextLine();
    System.out.println("\nEnter New Password= ");
    String newPassword ;
    newPassword=input.nextLine();
    
    
    
    
    try {
            // write data in Array List
            Path path = Paths.get(FilePath);
            List<String> lines = Files.readAllLines(path);

            // For loop on Array List (Email) 
            for (int i = 0; i < lines.size(); i++)
            {
                if (lines.get(i).equals(OldUsername)) 
                {
                    lines.set(i, NewName);
                    break;  
                }
                 
            }
            
            // For loop on Array List (Password) 
            for (int i = 0; i < lines.size(); i++)
            {
            if (lines.get(i).equals(OldPassword)) 
                {
                    lines.set(i, newPassword);
                    break;  
                }
            }

            // Write  new data lines back to the file
            Files.write(path, lines, StandardOpenOption.WRITE);
            System.out.println("===============================");
            
                System.out.println("File updated successfully.");

        } catch (IOException e) {
        }
    }
  
  //****************************************************************
  //****************************(((Delete)))******************************
  public void Delete(String FilePath) throws FileNotFoundException
    {
          
    
    //*******************************
    Scanner input = new Scanner(System.in);
    //*******************************
    System.out.println("==========================");
    System.out.println("Delete Account.......? ");
    System.out.println("\nEnter  Email= ");
    String DelUsername ;
    DelUsername=input.nextLine();
    System.out.println("Enter  Password= ");
    String DelPassword ;
    DelPassword=input.nextLine();
   
    
    
    try {
            // write data in Array List
            Path path = Paths.get(FilePath);
            List<String> lines = Files.readAllLines(path);

            // For loop on Array List (Email) 
            for (int i = 0; i < lines.size(); i++)
            {
                if (lines.get(i).equals(DelUsername)) 
                {
                    lines.set(i, "");
                    break;  
                }
                 
            }
            
            // For loop on Array List (Password) 
            for (int i = 0; i < lines.size(); i++)
            {
            if (lines.get(i).equals(DelPassword)) 
                {
                    lines.set(i, "");
                    break;  
                }
            }

            // Write  new data lines back to the file
            Files.write(path, lines, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("===============================");
            System.out.println("File Deleted successfully.");
        } catch (IOException e) {
        }
    }


 
}


    
    
   



     
       
    
    
      
    
    

