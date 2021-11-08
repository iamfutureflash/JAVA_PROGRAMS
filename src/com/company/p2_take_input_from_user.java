package com.company;
import java.util.*;
public class p2_take_input_from_user {
    public static void main(String args[]){
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("enter two integer to calculate sum");
        x=in.nextInt();
        y=in.nextInt();
        z=x+y;
        System.out.println("the sum of integer is "+z);


    }
}
