package mainPackage.model;

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

enum Category{
    Standard,
    Premium,
    Executive,
    Family
}

public class Room {

    private static int NumChambre = 0;
    private RoomType typeChambre;
    private boolean isAvailablle;
    private Vue vue;
    private Category category;

    public Room(RoomType typeChambre, Vue vue, Category category) {
        NumChambre++;
        this.typeChambre = typeChambre;
        this.isAvailablle = true;
        this.vue = vue;
        this.category = category;
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

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

}
