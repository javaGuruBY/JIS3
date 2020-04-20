package by.bariloegor.creditcard;

import by.bariloegor.creditcard.bean.CreditCard;
import by.bariloegor.creditcard.service.CreditCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args){
        Logger log = LoggerFactory.getLogger(App.class);
        CreditCardService creditCardService = new CreditCardService();

        CreditCard myCard = creditCardService.createCard(1111222233334444L, 2211);
        creditCardService.changeCreditLimit(myCard, 300);
        creditCardService.withdraw(myCard, 2211, 200);
        creditCardService.deposit(myCard, 2211, 500);
        String info = myCard.toString();
        log.info(info);
    }
}
