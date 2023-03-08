package com.mycompany.bai_1;

import java.util.Scanner;

public class BAI_1 {

    public static void main(String[] args) {
        int number1, number2;
        
        System.out.print("Nhập hai số nguyên: ");
        Scanner banPhim = new Scanner(System.in);
        number1 = banPhim.nextInt();
        number2 = banPhim.nextInt();
        
        System.out.println("Tổng: "+ (number1 + number2));
        System.out.printf("Hiệu:%d\n", number1 - number2);     
        System.out.println("Tích: "+ (number1 * number2));
        System.out.printf("Thương: %.2f\n ", 1.0 * number1 / number2);
        System.out.println("Chia lấy dư: "+ (number1 % number2));
        
        System.out.println("So sánh 2 số : "+ (number1>number2?number1:number2));
        // (a>b?a:b) nếu a lớn hơn b thì trả về a , nếu b lớn hơn a thì trả về b
        // nói cách khác số nào lớn hơn thì trả về số đó
        
             
    }
}
