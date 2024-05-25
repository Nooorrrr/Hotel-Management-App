package mainPackage.model;

import mainPackage.interfaces_graphiques.Warning;
enum RoomType {

    Single, Double, Triple, Quadruple

}
enum Category {
    Standard, Premium, Executive, Family
}
enum Vue {
    Beach, Mountain, City
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

    public Room(int id ,RoomType typeChambre, Category category,Vue vue) {
        this.ID_Room=id;
        this.typeChambre = typeChambre;
        this.isAvailablle = true;
        this.vue = vue;
        this.category = category;
        this.status=Room_status.Available;
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

    public static RoomType getroomtype(String type) {
        switch (type) {
            case "Single":
                return RoomType.Single;
            case "Double":
                return RoomType.Double;
            case "Triple":
                return RoomType.Triple;
            case "Quadruple":
                return RoomType.Quadruple;
            default:
                return RoomType.Quadruple;
        }
    }
    public static Category getroomcategory(String category) {
        switch (category) {
            case "Premium":
                return Category.Premium;
            case "Standard":
                return Category.Standard;
            case "Family":
                return Category.Family;
            case "Executive":
                return Category.Executive;
            default:
                return Category.Standard;
        }
    }
    public static Vue getroomview(String view) {
        switch (view) {
            case "Beach":
                return Vue.Beach;
            case "City":
                return Vue.City;
            case "Mountain":
                return Vue.Mountain;
            default:
                return Vue.City;
        }
    }

}
