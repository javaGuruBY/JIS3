package by.khilko;

import by.khilko.bean.CreditCard;
import by.khilko.service.CreditCardService;

public class App {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(222222, 1234);
        CreditCardService cardService = new CreditCardService();

        card.setCreditLimit(2000);
        card.setBalance(1000);
        cardService.deposit(card,1234,500);
        cardService.withdraw(card,1234,950);
        cardService.withdraw(card,1234,750);
        cardService.withdraw(card,1234,2000);
        cardService.deposit(card,1234,500);

    }
}
