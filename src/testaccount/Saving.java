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
public class Saving extends Account{
    public Saving(int customerID,double balance){
        super(customerID,balance);
    }

    /**
     *
     * @param wid
     * @return
     */
    public double withdraw(double wid ){
        return getbalance()-wid;
    }
    
    public double deposit(double depo){
        return getbalance()+depo;
        
    }

    @Override
    public void deposit(int depo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void withdraw(int wid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
}
