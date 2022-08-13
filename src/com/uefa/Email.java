package com.uefa;
import java.util.*;

public class Email {
    String firstName;
    String lastName;
    String password;
    String department;
    String email;
    int mailboxCapacity=500;
    int passwordLength=10;
    String alternativeEmail;
    String changePassword;
    String companySuffix="Scalacompany.com";

    //constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("EMAIL CREATED: " + this.firstName + "" + this.lastName);
        //call a department
        this.department = setDepartment();
//        System.out.println("Department:" + this.department);
        //call method random password
        this.password = randomPassword(passwordLength);
        System.out.println("Your password is: " + this.password);
        //combine elemnts to generate email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySuffix;
//        System.out.println("Your email is: "+email);
    }

    //ask department
    private String setDepartment() {
        System.out.println("New worker: " + firstName + lastName +" Enter the Department codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }

    }

    //generate a random password

    String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
    }


    //set mailbox capacity
public void  setMailboxCapacity(int Capacity){
        this.mailboxCapacity=Capacity;
}
    //set the alternative email

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    //change password
    public void changePassword(String password){
        this.changePassword= password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternativeEmail(){
        return alternativeEmail;
    }
    public String getPassword(){
        return password;
    }
public String showInfo(){
        return "DISPLAY NAME:"+firstName+""+lastName+
                "\nCOMPANY EMAIL: "+ email+
                "\nMAILBOX CAPACITY:"+mailboxCapacity +"mb";
}
}