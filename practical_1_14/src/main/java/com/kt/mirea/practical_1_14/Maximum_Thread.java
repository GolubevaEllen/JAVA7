/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kt.mirea.practical_1_14;

/**
 *
 * @author user
 */
public class Maximum_Thread extends Thread {
    private final int[] mas;
    private int maximal;

    public Maximum_Thread(int[] mas) {
        this.mas = mas;
    }
    public int getMaximal() {
        return maximal;
    }

    @Override
    public void run() {
        maximal = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maximal) {
                maximal = mas[i];
            }
        }
    }
}
