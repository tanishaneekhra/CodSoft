package project;

import java.util.*;
class ATMInterface{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int choice;
		double amount;
        BankAccount a=new BankAccount();

        while(true){
            a.display();
            System.out.print("Enter Choice:- ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Your Balance is Rs. "+a.checkBalance());
               break;

			case 2:
            System.out.println("Enter amount:- ");
            amount=sc.nextDouble();
            a.deposite(amount);
            System.out.println("Deposited Successfully...");
            break;

            case 3:
            System.out.println("Enter amount:- ");
            amount=sc.nextDouble();
             a.withdraw(amount);
             break;

             case 4:
             System.out.println("Thank You, Have a nice day (:"); 
             return ;

             default:
             System.out.println("Invalid choice, Pls try again");
        }
        System.out.println("-----------------");
        }
	   }
    }

class ATM {
  private double balance;
    public void bankBalance(double b){
        balance=b;
    }  

    public double checkBalance(){
        return balance;
    }

    public void  withdraw(double amount){
        if(amount<balance){
        balance=balance-amount;
        System.out.println("Withdrawal Successfully");
        }else{
            System.out.println("Insufficient Balance...!!");
        }

    }
    public void deposite(double amount){
        balance=balance+amount;

    }
}
class BankAccount extends ATM{

    void display() {
		System.out.println("Welcome to ATM..!");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposite");
		System.out.println("3. Withdraw");
		System.out.println("4.Exit");
	}

} 
