
package com.mycompany.bai_5;

import java.util.Scanner;

public class BAI_5 {

    public static void main(String[] args) {
        int number;
        int sum =0;
            Scanner banPhim = new Scanner(System.in);
        do{
            System.out.print("input number: ");
            number = banPhim.nextInt();
            
            sum += number;
            
            if(sum > 100){
                break;
            }
            
        }while(number > 0); 
        System.out.println("Tong la: " + sum); 
        
        
    }
}
