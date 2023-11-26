package M3C7.interfaces.implementation;

import M3C7.config.JdbcConfig;
import M3C7.dto.CreditCardDto;
import M3C7.entities.CreditCardEntity;
import M3C7.interfaces.CreditCardDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardDaoImpl implements CreditCardDao {
    @Override
    public CreditCardDto getCreditCardById(int id) {
        String query = "SELECT owner, number FROM credit_card where id = ?";
        try(Connection conn = JdbcConfig.getConection()) {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result =  statement.executeQuery();
            if(result.next()){
                String owner = result.getString("owner");
                String number = result.getString("number");
                return new CreditCardDto(owner, number );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<CreditCardDto> getAllCreditCard() {
        String query = "SELECT owner, number FROM credit_card";
        List<CreditCardDto> cards = new ArrayList<>();
        try(Connection conn = JdbcConfig.getConection()) {
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result =  statement.executeQuery();
            while(result.next()){
                String owner = result.getString("owner");
                String number = result.getString("number");
                cards.add(new CreditCardDto(owner, number));
            }
            return cards;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
