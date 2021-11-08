package com.company;
import java.util.Scanner;
public class p3_calc_si {
    public static void main(String args[]){
        float simpleInterest,principle,time,interest;
        Scanner takeinput = new Scanner(System.in);
        System.out.println("enter the principle");
        principle=takeinput.nextFloat();
        System.out.println("enter the time");
        time=takeinput.nextFloat();
        System.out.println("enter the interest");
        interest=takeinput.nextFloat();
        simpleInterest=(principle*time*interest)/100;
        System.out.println("Simple Interest is " + simpleInterest);
    }

}

