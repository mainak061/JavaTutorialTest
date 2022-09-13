import javax.swing.*;
import java.io.FilterOutputStream;
import java.util.*;
import java.util.Scanner;
import java.math.*;

public class Tutorial {
    public static void main(String[] args) {

//        float a=3, b=6, c=5, d=8, e=9,s,avg;
//        s=a+b+c+d+e;
//        avg=s/5;
//        System.out.println("Avg="+avg);
//    }
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//       int a, b, s, avg;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        s = a+b;
//        avg = s/2;
//        System.out.println("Avg"+avg);
//    String name="mainak sarkar";
//    int m;
//    System.out.println("Enter the value");
//    m= sc.nextInt();
//    System.out.println("Mr."+name+ " has recived "+m);
//        int a,b,s;
//        System.out.println("Enter two value");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        s=a%b;
//        System.out.println("value"+s);
//        int x=name.indexOf("i");
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
// WIDENING
//        int x=20;
//        double y=x;
//        System.out.println(x);
//        System.out.println(y);
// NARROWING
//        double x=20.15;
//        int y=(int)x;
//        System.out.println(x);
//        System.out.println(y);
//        Int TO Char CONVERSION
//        int x=66;
//        char y=(char)x;
//        System.out.println(x);
//        System.out.println(y);
//        int x;
//
//        System.out.println("Enter the exact value");
//        x=sc.nextInt();
//        if(0<x && x<=10) {
//            System.out.println("Rs-"+2*x);
//        }
//        else if (10<x && x<=20) {
//            System.out.println("Rs-"+3*x);
//        } else if (20<x && x<=30) {
//            System.out.println("Rs-"+4*x);
//        }
//        else {
//            System.out.println("Rs-"+5*x);
//        }
// Take values from user and check if its a rectangle or a square
//        int len, br;
//        System.out.println("Enter the exact amount");
//        len = sc.nextInt();
//        br = sc.nextInt();
//        if (len ==br) {
//            System.out.println("It's a square");
//        }
//        else {
//            System.out.println("It's a rectangle");
//        }
// Take 3 numbers from use and print the greatest one
//        int a,b,c,d;
//        System.out.println("Enter four values");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c= sc.nextInt();
//        d= sc.nextInt();
//        if (a>b && a>c && a>d) {
//            System.out.println("The greatest number is"+a);
//        } else if (b>a && b>c && b>d) {
//            System.out.println("The greatest number is"+b);
//        }
//        else if(c>a && c>b && c>d){
//            System.out.println("The greatest number is"+c);
//        }
//        else {
//            System.+out.println("The greatest number is"+d);
//        }
// Leap year defining
//        int x;
//        System.out.println("Enter the year");
//        x= sc.nextInt();
//        if ((x%4==0 && x%100!=0) || (x%400==0)){
//            System.out.println("It's a leap year");
//        }
//        else{
//            System.out.println("Not leap year");
// Project:
//        int x , y;
//        System.out.println("Enter the values");
//        x= sc.nextInt();
//        y=sc.nextInt();
//        System.out.println("0.exit\n1.sum\n2.sub\n3.multi\n4.div\n5.mod");
//        int ch=sc.nextInt();
//        switch (ch){
//            case 0:
//                break;
//            case 1:
//                System.out.println("Sum of vales is "+(x+y));
//                break;
//            case 2:
//                System.out.println("Subtraction of  values is "+(x-y));
//                break;
//            case 3:
//                System.out.println("Multiplication of values is "+(x*y));
//                break;
//            case 4:
//                System.out.println("Division of values is "+(x/y));
//                break;
//            case 5:
//                System.out.println("Modulus of values is"+(x%y));
//                break;
//        }
//        int i=0;
//        for(i=0;i<=5;i++)
//            do {
//                System.out.println(i);
//                i++;
//            }while (i<=5);
// Print the first 10 natural numbers using for loop
//        int i;
//        for(i=0;i<11;i++)
//            System.out.println(i);
//        int i,a=5;
//        for(i=1;i<11;i++)
//            System.out.println(a+ "X" +i+"="+(i*5));
//        int i, j, k = 6;
//        for (i = 0; i < k; i++) {
//
//            for (j = k-i; j>1; j--) {
//                System.out.print("  ");}
//                for (j = 0; j <= i; j++) {
//                    System.out.print("  * ");
//                }
//            System.out.println();
//            }
//        Wap to check it's a palindrome or not
//        int a,r=0,d,i;
//        System.out.println("Enter the number: ");
//        a= sc.nextInt();
//        for(i=a; i!=0; i=i/10){
//            d = i%10;
//            r = r*10+d;
//        }
//        if(a == r)
//            System.out.println("Palindrome");
//        else
//            System.out.println("its not a palindrome");
//        int arr[]={1,2,3,4,5,5};
//        int i;
//        for(i=0;i<5;i++);{
//            System.out.println(arr[i]);
//        }
//        int a = 10;
//        int arr[];
//        int i;
//        System.out.println("Enter data");
//        for(i=0; i< a; i++)
//        {
//            arr[]=sc.nextInt();
//        int b;
//        System.out.println("Name- ");
//        String name=sc.next();
//        System.out.println("Age- ");
//        b=sc.nextInt();
//        System.out.println("My name is "+name);
//        System.out.println("My age is "+b);
//    currency converter
//        float a,d,p,z;
//        System.out.println("Enter the INR amount- ");
//        a= sc.nextFloat();
//        d=a*79;
//        p=a*111;
//        z=a*70;
//        System.out.println("Amount in USD is- "+d);
//        System.out.println("Amount in POUND is-  "+p);
//        System.out.println("Amount in ZEN- "+z);
//        Reverse a string
//                String str, rev = "";
//
//                str = "mango";
//                char ch;
//                System.out.println("Original word- " + str);
//                for (int i = 0; i < str.length(); i++) {
//                    ch = str.charAt(i);
//                    rev = ch + rev;
//                }
//                System.out.println("Reverse word- " + rev);
//       " Math. " function use
//        double x=Math.sqrt(34);
//        System.out.println(x);
//        sum(4.5f);
//    }
//
//    public static void sum(int a) {
//        System.out.println("Int value is- "+a);
//    }
//
//    public static void sum(float a) {
//        System.out.println("Float value is- "+a);
    }
}