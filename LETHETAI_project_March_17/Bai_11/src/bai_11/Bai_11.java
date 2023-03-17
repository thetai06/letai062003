
package bai_11;

import java.util.Scanner;

public class Bai_11 {

    public static void main(String[] args) {
         int arr[], size, swap;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập kích cỡ mảng: ");
        size = scanner.nextInt();
        
        arr = new int[size];
        
        System.out.print("Nhập phần tử mảng: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }       
       
    }
    }
}
}
