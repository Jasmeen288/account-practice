/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccount;

/**
 *
 * @author mydev
 */
public abstract class Account {
    private int customerID;
    private double balance;
    public Account(int customerID,double balance)
    {
        this.customerID=customerID;
        this.balance=balance;
    }
    public abstract void deposit(int depo);
    public abstract void withdraw(int wid);

    /**
     * @return the balance
     */
    public double getbalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setbalance(double balance) {
        this.balance = balance;
    }
    
    
    
}
