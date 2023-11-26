package M3C7.interfaces.implementation;

import M3C7.config.JdbcConfig;
import M3C7.dto.DebitCardDto;
import M3C7.entities.DebitCardEntity;
import M3C7.interfaces.DebitCardDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DebitCardDaoImpl implements DebitCardDao {
    @Override
    public DebitCardDto getDebitCardById(int id) {
        String query = "SELECT * FROM debit_card where id = ?";
        try(Connection conn = JdbcConfig.getConection()) {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result =  statement.executeQuery();
            if(result.next()){
                String owner = result.getString("owner");
                String number = result.getString("number");
                return new DebitCardDto(owner, number );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<DebitCardDto> getAllDebitCard() {
        String query = "SELECT owner, number FROM debit_card";
        List<DebitCardDto> cards = new ArrayList<>();
        try(Connection conn = JdbcConfig.getConection()) {
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result =  statement.executeQuery();
            while(result.next()){
                String owner = result.getString("owner");
                String number = result.getString("number");
                cards.add(new DebitCardDto(owner, number));
            }
            return cards;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
