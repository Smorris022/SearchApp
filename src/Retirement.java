
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author WHIT216
 */
public class Retirement {
    
    private String id;
    private String date;
    private double contribution;
    private double amtMa;
    private double balance;

    

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getContribution() {
        return contribution;
    }

    public void setContribution(double contribution) {
        this.contribution = contribution;
    }

    public double getAmtMa() {
        return amtMa = contribution + balance;
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void Read(Scanner scan){
        String [] info2 = scan.nextLine().split(",");
        id = (info2[0]);
        date = (info2[1]);
        contribution = Double.parseDouble(info2[2]);
        
        balance = Double.parseDouble(info2[3]); 
    }
}