package M2C4.set.classes;

import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {

    private Set<String> guests = new HashSet<>();

    public void addGuest(String guest){
        guests.add(guest);
    }

    public void removeGuest(String guest){
        guests.remove(guest);
    }

    public boolean isGuestInList(String guest){
        return guests.contains(guest);
    }

    public int getTotalGuests(){
        return guests.size();
    }

    public boolean isGuestListEmpty(){
        return guests.isEmpty();
    }
}
