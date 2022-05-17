package com.company;
import java.util.*;
class randnum{
    public static void check(int a,int b){
        if (1<a && a<100 ) {
            if (a == b) {
                System.out.println("you guessed the number correctly");
            } else if (a > b) {
                System.out.println("number is higher than the generated number");
            }else {
                System.out.println("number is lower than the generated number");
            }
        }
        else{
            System.out.println("number is out of range");
        }
    }
}
public class numberguesinggame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int min=sc.nextInt();
        int max=sc.nextInt();
        int b = (int)(Math.random()*(max-min+1)+min);
        randnum rn= new randnum();
        rn.check(a,b);
    }
}
