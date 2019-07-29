package com.company;

public class BankAccount {


    private double amount;
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        setAmount(getAmount() + sum);
        System.out.println("Счет пополнен на: +"+sum);

    }

    public void withDraw(int sum) throws LimitExeption {
        if (sum > getAmount()){
            throw new LimitExeption("Запрашиваемая сумма на снятие" +
                    " больше чем остаток на счете",getAmount());
        }
        setAmount(getAmount() - sum);
        System.out.println("Со счета снято: -"+sum);
    }
}
