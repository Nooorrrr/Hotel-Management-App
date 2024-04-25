package main;

enum RoomType{
    SIMPLE,
    DOUBLE,
    TRIPLE,
    QUAD
}

enum Status{
    ACCEPTED,
    RUFUSED,
    PENDING
}

enum Vue{
    BEACH,
    MOUNTAIN,
    City
}

public class Room {

    private static int NumChambre = 0;
    private RoomType typeChambre;
    private boolean isAvailablle;
    private Vue vue;
    private boolean hasBuffet;

    public Room(RoomType typeChambre, Vue vue, boolean hasBuffet) {
        NumChambre++;
        this.typeChambre = typeChambre;
        this.isAvailablle = true;
        this.vue = vue;
        this.hasBuffet = hasBuffet;
    }

    public int getNumeroChambre() {
        return NumChambre;
    }

    public RoomType getTypeChambre() {
        return typeChambre;
    }

    public boolean isAvailablle() {
        return isAvailablle;
    }

    public void setAvailability(boolean available) {
        this.isAvailablle = available;
    }

    public Vue getVue() {
        return vue;
    }

    public boolean hasBuffet() {
        return hasBuffet;
    }

    public void setHasBuffet(boolean hasBuffet) {
        this.hasBuffet = hasBuffet;
    }

}
