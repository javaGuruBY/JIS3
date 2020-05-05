package by.jrr;

import by.jrr.bean.CreditCard;
import by.jrr.service.CreditCardService;

public class App {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(12341234, 1234);
        CreditCardService creditCardService = new CreditCardService();
        System.out.println("Balance= " + creditCard.getBalanceCreditCard());
        creditCardService.deposit(creditCard, 1234, 500);
        System.out.println("+500. After operation balance = " + creditCard.getBalanceCreditCard());
        creditCardService.withdraw(creditCard, 1234, 100);
        System.out.println("-100. After operation balance = " + creditCard.getBalanceCreditCard());

    }
}
