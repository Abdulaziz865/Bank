package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(50000);
        System.out.println("Ваш текущий счет : " + bankAccount.getAmount());
        while (true) {
            System.out.println("");
            System.out.println("(1) Выход");
            System.out.println("(2) Пополнить баланс");
            System.out.println("(3) Вывести наличными");
            double summa = scanner.nextDouble();
            try {
                if (summa == 1) {
                    System.out.println("ПРОЩАЙТЕ...");
                    break;
                }
                if (summa == 2) {
                    bankAccount.deposite(summa);

                }
                if (summa == 3) {
                    bankAccount.withdraw(summa);
                }
            } catch (InputMismatchException e) {
                System.out.println("ВВЕДИ ЦЕЛОЕ ЧИСЛО !!!");
                break;
            }
            System.out.println("Ваш текущий счет : " + bankAccount.getAmount());
            if (bankAccount.getAmount() <= 0) {
                System.out.println("У вас не осталось денег , пополните баланс ___" + " Рекомендуемая сумма пополнения - 50 000$");
                break;
            }
        }

        }catch (InputMismatchException e){

        }
    }
}