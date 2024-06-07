/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.maths;

import java.util.Random;
import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generating two single-digit integers
        int number1 = random.nextInt(9) + 1;
        int number2 = random.nextInt(9) + 1;

        
        if (number2 > number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.printf("What is %d - %d?\n ", number1, number2);
        int answer = scanner.nextInt();

        // Check the student's answer
        if (answer == number1 - number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2));
        }
    }
}

