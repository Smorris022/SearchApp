
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WHIT216
 */
public class Employee {

  
    
private String id;
private String fName;
private String lName;
private String address;
private String city;
private String state;
private String zip;
private String phone;
private String dob;
private String martial;
private String dateHired;

 
 
        

  public String getId() {
        return id;
    }

    public String getFname() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getDOB() {
        return dob;
    }

    public String getMartial() {
        return martial;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fName = fname;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDOB(String DOB) {
        this.dob = DOB;
    }

    public void setMartial(String Martial) {
        this.martial = Martial;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

   

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fname=" + fName + ", lName=" + lName + ", Address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", DOB=" + dob + ", Martial=" + martial + ", dateHired=" + dateHired + '}';
    }
    
    public void Read(Scanner scan){
        String[] info1 = scan.nextLine().split(",");
        id = (info1[0]);
        fName = (info1[1]);
        lName = (info1[2]);
        address = (info1[3]);
        city = (info1[4]); 
        state = (info1[5]);
        zip = (info1[6]);
        phone = (info1[7]);
        dob = (info1[8]);
        martial = (info1[9]);
        dateHired = (info1[10]);
        
        
    }
   
}
