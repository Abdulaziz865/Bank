package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {

    Scanner scanner = new Scanner(System.in);
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposite(double sum) {
            this.amount += sum;
    }

    public boolean withdraw(double sum) throws InputMismatchException {
        if (sum == 3) {
            amount += 3;
            System.out.println("Введите число для вывода : ");
            double summa = scanner.nextDouble();
            withdraw(summa);
        }
        if (sum <= 0) {
            System.out.println("Чел... кого ты пытаешься обмануть???");
            amount += sum;
        }
        if (amount >= sum) {
            this.amount -= sum;
        } else {
            System.out.println("На вашем балансе не достаточно средств чтобы вывести такую сумму!!! Введите другую сумму");
            amount = this.getAmount();
        }
        return true;
    }
}
