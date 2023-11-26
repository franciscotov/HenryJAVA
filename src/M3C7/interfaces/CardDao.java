package M3C7.interfaces;

import M3C7.dto.CardDto;

public interface CardDao {
    CardDto findById(int id);
    void save(CardDto cardDto);
    void update(CardDto cardDto);
    void delete(int id);
}
