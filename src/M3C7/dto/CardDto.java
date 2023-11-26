package M3C7.dto;

public class CardDto {
    String owner;
    String number;

    public CardDto(String owner, String number) {
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
