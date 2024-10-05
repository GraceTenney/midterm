package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.TimeUnit.SECONDS.sleep(30);
        System.out.println("Hello world!");
        /*JOptionPane.showMessageDialog(null, "Hello World");
        int option = JOptionPane.showConfirmDialog(null, "Do the thing");
        checkThing(option);
        // -1 = exit
        // 0 = yes
        // 1 = no
        // 2 = cancel
        JOptionPane.showMessageDialog(null, option + "" + checkThing(option));*/
    }
    public static boolean checkThing(int option) {
        return option == 0;
    }
}