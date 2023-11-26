package M3C7.entities;

public class CardEntity {
    String owner;
    String number;

    @Override
    public String toString() {
        return "CardEntity{" +
                "owner='" + owner + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public CardEntity(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
