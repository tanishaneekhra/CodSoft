package project;

import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the marks of Subjects out of 100:");

        System.out.print("Marks of Maths :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Marks of English:");

        int b=sc. nextInt();
        System.out.print("Marks of Science:");

        int c=sc. nextInt();
        System.out.print("Marks of Hindi:");
        int d=sc. nextInt();

        System.out.print("Marks of Social Science :");
        int e=sc. nextInt();

        int sum= a+b+c+d+e;

        System.out.println("Sum of total marks obtained in all subjects = " +sum);
         
        int avg=sum/5;
        System.out.println("The average percentage is : "+avg);
    

        if(avg>=80){
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<80){
            System.out.println("Grade B");
        }
        else if(avg>=40 && avg<60){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }
        
    }

}
        

        




      
    
    

