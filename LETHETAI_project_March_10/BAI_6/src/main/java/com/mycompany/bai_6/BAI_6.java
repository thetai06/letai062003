package com.mycompany.bai_6;

import java.util.Scanner;

public class BAI_6 {

    public static void main(String[] args) {
        int number ;
        Scanner banPhim = new Scanner(System.in);
        System.out.print("Input number: ");
               
        number = banPhim.nextInt();
        for(int i =1 ; i <= number ; i++){
            int n;
            n *= i;  }
        
            int giaiThua;        
            giaiThua = number * n;
        
            System.out.println("giai thừa = "+ giaiThua);
             
    }
}
