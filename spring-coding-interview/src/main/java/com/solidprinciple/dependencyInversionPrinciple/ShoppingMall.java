package com.solidprinciple.dependencyInversionPrinciple;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        BankCard dCard = new DebitCard();
        ShoppingMall shoppingByDebitCard = new ShoppingMall(dCard);
        shoppingByDebitCard.doPurchaseSomething(5000);

        BankCard cCard = new CreditCard();
        ShoppingMall shoppingByCreditCard = new ShoppingMall(cCard);
        shoppingByCreditCard.doPurchaseSomething(4000);
    }
}
