package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Lütfen birinci sayıyı giriniz : ");
    float a= scanner.nextFloat();

    System.out.print("Lütfen ikinci sayıyı giriniz: ");
    float b= scanner.nextFloat();

    float carpim = a*b;

    System.out.println("Sayıların çarpım sonucu : "+carpim);

    }
}
