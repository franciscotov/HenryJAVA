package M3C7.interfaces;

import M3C7.dto.CreditCardDto;

import java.util.List;

public interface CreditCardDao {
    CreditCardDto getCreditCardById(int id);
    List<CreditCardDto> getAllCreditCard();
}
