package test;
public class Chambre {

	private int numero;
    public String type;
    private boolean estReservee;

    public Chambre(int numero, String type) {
        this.numero = numero;
        this.type = type;
        this.estReservee = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getType() {
        return type;
    }

    public boolean estReservee() {
        return estReservee;
    }

    public void reserver() {
        estReservee = true;
    }

    public void annulerReservation() {
        estReservee = false;
    }
}