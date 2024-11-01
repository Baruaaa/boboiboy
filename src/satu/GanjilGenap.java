package satu;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {

        Scanner input = getInput();


        System.out.print("Masukkan angka: ");


        if (input.nextInt() % 2 == 0) {
            System.out.println(input.nextInt() + " adalah angka genap.");
        } else {
            System.out.println(input.nextInt() + " adalah angka ganjil.");
        }


        input.close();
    }

    private static Scanner getInput() {
        Scanner input = new Scanner(System.in);
        return input;
    }
}