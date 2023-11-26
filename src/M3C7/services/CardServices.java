package M3C7.services;

import M3C7.config.JdbcConfig;
import M3C7.dto.CardDto;
import M3C7.dto.CreditCardDto;
import M3C7.dto.DebitCardDto;
import M3C7.entities.CreditCardEntity;
import M3C7.entities.DebitCardEntity;
import M3C7.interfaces.CreditCardDao;
import M3C7.interfaces.DebitCardDao;
import M3C7.interfaces.implementation.CreditCardDaoImpl;
import M3C7.interfaces.implementation.DebitCardDaoImpl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class CardServices {
    private final CreditCardDao creditCardDAO;
    private final DebitCardDao debitCardsDAO;

    public CardServices() {
        this.creditCardDAO = new CreditCardDaoImpl();
        this.debitCardsDAO = new DebitCardDaoImpl();
    }

    public List<CreditCardDto> getAllCreditCard() {
        return creditCardDAO.getAllCreditCard();
    }

    public CreditCardDto getCreditCardById(int id) {
        return creditCardDAO.getCreditCardById(id);
    }

    public List<DebitCardDto> getAllDebitCard() {
        return debitCardsDAO.getAllDebitCard();
    }

    public DebitCardDto getDebitCardById(int id) {
        return debitCardsDAO.getDebitCardById(id);
    }
}
