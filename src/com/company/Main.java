package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount();
        newAccount.setName("До востребования");
        newAccount.deposit(10000);
        System.out.println("На вашем счете " + newAccount.getName()
                + ": " + newAccount.getAmount() + "сом");

        try {
            while (newAccount.getAmount() > 0) {
                newAccount.withDraw(6000);
                System.out.println("На вашем счете " + newAccount.getName()
                        + ": " + newAccount.getAmount() + "сом");
            }


        } catch (LimitExeption e) {
            e.printStackTrace();
            System.out.println("На вашем счете " + newAccount.getName()
                    + ": " + newAccount.getAmount() + "сом");

        } finally {
            System.out.println("Со счета снято: -" + newAccount.getAmount());
            newAccount.setAmount(newAccount.getAmount() - newAccount.getAmount());
            System.out.println("На вашем счете " + newAccount.getName()
                    + ": " + newAccount.getAmount() + "сом");
        }

    }
}

