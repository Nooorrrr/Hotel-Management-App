

public class Chambre {

    
    private int NumChambre;
    private String typeChambre;
    private boolean estDisponible;

    public Chambre(int NumChambre, String typeChambre) {
        this.NumChambre = NumChambre;
        this.typeChambre = typeChambre;
        this.estDisponible = true;
    }

    public int getNumeroChambre() {
        return NumChambre;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public boolean estDisponible() {
        return estDisponible;
    }

    public void setDisponibilite(boolean disponible) {
        this.estDisponible = disponible;
    }
}

