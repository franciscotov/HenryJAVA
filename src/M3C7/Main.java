package M3C7;


import M3C7.config.JdbcConfig;
import M3C7.dto.CreditCardDto;
import M3C7.dto.DebitCardDto;
import M3C7.services.CardServices;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CardServices cardServices = new CardServices();
        JdbcConfig.createCreditCardTable();
        JdbcConfig.createDebitCardTable();
//        JdbcConfig.runDataChanger();
        CreditCardDto firstCreditCard = cardServices.getCreditCardById(1);
        if(firstCreditCard != null) {
            System.out.println("The number of card is: " + firstCreditCard.getNumber());
            System.out.println("The owner of card is: " + firstCreditCard.getOwner());
        }
        DebitCardDto firstDebitCard = cardServices.getDebitCardById(1);
        if(firstDebitCard != null) {
            System.out.println("The number of card is: " + firstDebitCard.getNumber());
            System.out.println("The owner of card is: " + firstDebitCard.getOwner());
        }

        List<CreditCardDto> allCreditCard = cardServices.getAllCreditCard();
        if(!allCreditCard.isEmpty()) {
            allCreditCard.forEach(card -> System.out.println(card));
        }
        List<DebitCardDto> allDebitCard = cardServices.getAllDebitCard();
        if(!allDebitCard.isEmpty()) {
            allDebitCard.forEach(card -> System.out.println(card));
        }
    }
}
