/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccount;
import static java.sql.DriverManager.println;
import java.util.Scanner;

/**
 *
 * @author mydev
 */
public class TestAccount {

   
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter customerID=");
        int customerID= s.nextInt();
       
       System.out.print("Enter balance for savings account=");
       double balance= s.nextDouble();
       System.out.print("Enter overdraft value for savings account=");
       double overdraftvalue= s.nextDouble();
       System.out.println("1. Deposit amount to savings");
       System.out.println("2. Withdraw amount from savings");
       System.out.println("3. Exit");
       
       Saving v= new Saving( customerID ,balance); 
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
     if
        (a==1){
         System.out.println("Enter an ammount deposit to your saving account=");
         double deposit=sc.nextDouble();
         System.out.println("Current balance in your account="+v.deposit(deposit));
     }
         
         else if
         (a==2){
        System.out.println("Enter an ammount to be withdrawn from savings account=");
        double withdrawn=sc.nextDouble();
        System.out.println("total is"+(overdraftvalue+withdrawn));
        
       }  
        if (a==3);
        {
           System.out.println("Exit"); 
        }
      
     
    }
    
}

      
       
    

