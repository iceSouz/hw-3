package com.test;


public class ATM {

    public static void main(String[] args) {
        System.out.println(countBanknotes(502));
        // 500, 200, 100, 50, 20, 10, 5, 2 и 1
    }

    public static int countBanknotes(int sum) {
        int count = 0;

        boolean flag = false;
        while (!flag) {
            if (sum >= 500) {
                sum -= 500;
                count++;
            } else if (sum >= 200) {
                sum -= 200;
                count++;
            } else if (sum >= 100) {
                sum -= 100;
                count++;
            } else if (sum >= 50) {
                sum -= 50;
                count++;
            } else if (sum >= 20) {
                sum -= 20;
                count++;
            } else if (sum >= 10) {
                sum -= 10;
                count++;
            } else if (sum >= 5) {
                sum -= 5;
                count++;
            } else if (sum >= 2) {
                sum -= 2;
                count++;
            } else if (sum >= 1) {
                sum -= 1;
                count++;
            } else {
                flag = true;
            }
        }

        return count;
    }
}