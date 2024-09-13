package UNECON.HomeWorks;

import java.util.Scanner;

public class DecToBin{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    if(n < 0){
        System.out.println(0);
    }
    String x = "";
    while(n > 0){
        x = n%2 + x;
        n /= 2;
    }
    System.out.println(x);
    }
}
