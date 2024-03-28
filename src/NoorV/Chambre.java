package NoorV;


public class Chambre {
 
    private static int NumChambre=0;
    private String typeChambre;
    private boolean estDisponible;

    public Chambre(String typeChambre) {
        NumChambre++;
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

