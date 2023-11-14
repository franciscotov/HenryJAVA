package M2C4.set;

import M2C4.set.classes.PartyGuestList;

public class Main {
    public static void main(String[] args) {
        PartyGuestList partyGuest = new PartyGuestList();
        String guest1 = "a-guest";
        String guest2 = "b-guest";
        String guest3 = "c-guest";

        // Adding guests
        partyGuest.addGuest(guest1);
        partyGuest.addGuest(guest2);
        partyGuest.addGuest(guest3);

        // Verify if a guest is in the set
        System.out.println("The guest " + guest2 + " is in the list: " + partyGuest.isGuestInList(guest2));

        // Deleting a guest
        partyGuest.removeGuest(guest3);

        // Total guest list
        System.out.println("There are " + partyGuest.getTotalGuests() + " in the list");

        // Verify of list is empty
        System.out.println("The guest list is empty?: " + partyGuest.isGuestListEmpty());
    }
}
