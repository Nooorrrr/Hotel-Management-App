package mainPackage.model;

enum RoomType{
    Single, Double, Triple, Quadruple
}



enum Vue{
    Beach, Mountain, City
}

enum Category{
    Standard, Premium, Executive, Family
}


public class Room {

    private static int NumChambre = 0;
    private int ID_Room ;
    private RoomType typeChambre;
    private boolean isAvailablle;
    private Vue vue;
    private Category category;
    private Room_status status;

    public Room(RoomType typeChambre, Vue vue, Category category,Room_status status) {
        NumChambre++;
        this.ID_Room=NumChambre;
        this.typeChambre = typeChambre;
        this.isAvailablle = true;
        this.vue = vue;
        this.category = category;
        this.status=status;
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

    public Room_status getStatus() {
        return status;
    }

    public int getID_Room() {
        return ID_Room;
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
