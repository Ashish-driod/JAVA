package ques_5;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        int a = sc.nextInt();
        try{
            valid(a);
            boolean flag = false;
            for(int i=2; i<a/2; i++){
                if(a%i==0){
                    flag=true;
                    break;
                }
            }
            if(!flag)
                System.out.println("Prime Number");
            else
                System.out.println("Not a prime Number");
        }catch(Exception e){
            System.out.println("Exception caught: "+e);
        }

    }
    static void valid(int n) throws NumberException{
        if(n<0)
            throw new NumberException("Number is Negative");
        else if(n>100)
            throw new NumberException("Number is too large.");
    }
}
