package emailapp;

import java.util.Scanner;

/**
You are an IT Support Administrator Specialist and are charged with the with the task of creating new email account
 for new hires.

 The application should do the following;
 >Generate an email with the following syntax: firstname.lastname@department.company.com
 >Determine the Department (Sales, Development or Accounting), if none leave blank
 >Generate a random String for a password.
 >Have set methods to change the password, set the mailbox capacity, and define an alternate email address
 >Have get methods to display the name, email, and mailbox capacity
 */
public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive the firstName and lastName

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Generated for " + firstName + " " + lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }


    //Ask for the Department

    public String setDepartment(){
        System.out.println("DEPARTMENT CODE:\n1 for Sales\n2 for Develoment\n3 for Accounting\n4 " +
                "for none");
        System.out.println("Enter department code:");
        Scanner input = new Scanner(System.in);
        int depCode = input.nextInt();
        if (depCode==1){return "Sales";}
        else if (depCode==2){return "Development";}
        else if (depCode==3){return "Accounting";}
        else return "";
    }
    //Generate a Random password

    //Set the mailbox capacity

    //Set the alternate email

    //Change the password
}
