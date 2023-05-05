// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
// 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        while (num != -1) {
            System.out.print("Bir sayı giriniz (-1 toplamı hesaplar ve çıkar): ");
            num = scanner.nextInt();

            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        }

        System.out.println("Girilen çift ve 4'ün katı sayıların toplamı: " + sum);
    }
}