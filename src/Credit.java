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
public class Credit {
    
    private String id;
    private String company;
    private double limit;
    private double balance;
    private double accountCredit;
    private String accountType;
    private String accountStatus;

   
    
    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   
    public double getAccountCredit() {
        return this.accountCredit = limit + balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    
        public void Read(Scanner scan){
        String [] info3 = scan.nextLine().split(",");
        id = (info3[0]);
        company = (info3[1]);
        limit = Double.parseDouble(info3[2]);
        balance = Double.parseDouble(info3[3]);
        accountType = (info3[4]);
        accountStatus = (info3[5]);
        }     

}