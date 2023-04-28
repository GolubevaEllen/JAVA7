/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kt.mirea.practical_1_14;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practical_1_14 {

    public static void main(String[] args) {
        System.out.println("Практическая работа 1.14 | Вариант 3 | Голубева А.П.");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числовую последовательность через запятую:");
        String input = scanner.nextLine();
        String[] numbers = input.split(","); 
            //split -  возвращает массив строк из строки, разделённой по введённому символу
        int[] seq = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            seq[i] = Integer.parseInt(numbers[i]);
            //parseInt - строка в число 
        }
        
        Minimal_Thread min = new Minimal_Thread(seq);
        Maximum_Thread max = new Maximum_Thread(seq);
        min.start();
        max.start();
        try {
            //join - главный поток ждёт завершения выполнения вызванного потока
            min.join();
            max.join();
        } catch (InterruptedException ex) {    
        }
        System.out.println("Максимальное значение: " + max.getMaximal());
        System.out.println("Минимальное значение: " + min.getMinimal());
    }
}
