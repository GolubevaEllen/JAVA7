/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kt.mirea.practical_1_14;

/**
 *
 * @author user
 */
public class Minimal_Thread extends Thread {
    private final int[] mas;
    private int minimal;

    public Minimal_Thread(int[] mas) {
        this.mas = mas;
    }
    public int getMinimal() {
        return minimal;
    }

    @Override
    public void run() {
        minimal = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < minimal) {
                minimal = mas[i];
            }
        }
    }
}
