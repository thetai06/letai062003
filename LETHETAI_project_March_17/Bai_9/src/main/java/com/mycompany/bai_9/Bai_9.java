package com.mycompany.bai_9;

import java.util.Scanner;

public class Bai_9 {

    public static void main(String[] args) {
         String chuoi;
        int UpperCase = 0, LowerCase = 0, Number = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập chuỗi : ");
        chuoi = scanner.nextLine();
        
        for(int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i) >= 'A' && chuoi.charAt(i) <= 'Z')
                UpperCase++;
            else if(chuoi.charAt(i) >= 'a' && chuoi.charAt(i) <= 'z')
                LowerCase++;
            else if(chuoi.charAt(i) >= '0' && chuoi.charAt(i) < '9')
                Number++;
        }
        
        System.out.println("Viết hoa: " + UpperCase);
        System.out.println("Viết thường: " + LowerCase);
        System.out.println("số : " + Number);
   
    }
    }

