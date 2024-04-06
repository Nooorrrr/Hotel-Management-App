package NoorV;

public class test {
    public static void main(String[] args) {
        Admin a = new Admin();
        client c1 = new client("user1", "pass1", 1, "nom1", "prenom1", "email1", "adresse1", "telephone1");
        client c2 = new client("user2", "pass2", 2, "nom2", "prenom2", "email2", "adresse2", "telephone2");
        client c3 = new client("user3", "pass3", 3, "nom3", "prenom3", "email3", "adresse3", "telephone3");

        a.AjouterClient(c1);
        a.AjouterClient(c2);
        a.AjouterClient(c3);

        Chambre chambre1 = new Chambre(TypeChambre.SIMPLE);
        Chambre chambre2 = new Chambre(TypeChambre.DOUBLE);
        Chambre chambre3 = new Chambre(TypeChambre.SUITE);

        a.AjouterChambre(chambre1);
        a.AjouterChambre(chambre2);
        a.AjouterChambre(chambre3);

        c1.reserverChambre(TypeChambre.SIMPLE, "2021-05-01", "2021-05-10");
        c2.reserverChambre(TypeChambre.DOUBLE, "2021-05-01", "2021-05-10");

    }
}
