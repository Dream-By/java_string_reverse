package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B="";
            StringBuilder stringbuilder = new StringBuilder(A);
            stringbuilder.reverse();
            B=stringbuilder.toString();
            if (A.equals(B)){
                System.out.println("Yes");
            } else
            {
                System.out.println("No");
            }

        }
}
