package M3C7.interfaces;

import M3C7.dto.DebitCardDto;

import java.util.List;

public interface DebitCardDao {
    DebitCardDto getDebitCardById(int id);
    List<DebitCardDto> getAllDebitCard();
}
