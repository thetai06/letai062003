
package bai_12;

import java.util.Scanner;

public class Bai_12 {

    public static void main(String[] args) {
        int arr[][], hang, cot, max = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số hàng: ");
        hang = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        cot = scanner.nextInt();
        
        arr = new int[hang][cot];
        
        System.out.print("Nhập phần tử của ma trận: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Ma trận: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        System.out.print("Phần từ lớn nhất trong ma trận là: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < arr[i][j]) 
                    max = arr[i][j];               
            }
        }
        System.out.println(max); 
               
    }
    
}
