package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utilisateur {
	    private String nom;
	    private String motDePasse;

	    public Utilisateur(String nom, String motDePasse) {
	        this.nom = nom;
	        this.motDePasse = motDePasse;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getMotDePasse() {
	        return motDePasse;
	    }
	}

	class Client extends Utilisateur {
	    private List<Reservation> reservations;

	    public Client(String nom, String motDePasse) {
	        super(nom, motDePasse);
	        this.reservations = new ArrayList<>();
	    }

	    public List<Reservation> getReservations() {
	        return reservations;
	    }

	    public void ajouterReservation(Reservation reservation) {
	        reservations.add(reservation);
	    }

	    public void modifierReservation(int id, Date dateDebut, Date dateFin) {
	        for (Reservation reservation : reservations) {
	            if (reservation.getId() == id) {
	                reservation.dateDebut = dateDebut;
	                reservation.dateFin = dateFin;
	                break;
	            }
	        }
	    }

	    public void annulerReservation(int id) {
	        for (Reservation reservation : reservations) {
	            if (reservation.getId() == id) {
	                reservations.remove(reservation);
	                break;
	            }
	        }
	    }
	}

	class Admin extends Utilisateur {
	    private Map<Integer, Chambre> chambres;
	    private List<Reservation> demandes;

	    public Admin(String nom, String motDePasse) {
	        super(nom, motDePasse);
	        this.chambres = new HashMap<>();
	        this.demandes = new ArrayList<>();
	    }

	    public Map<Integer, Chambre> getChambres() {
	        return chambres;
	    }

	    public List<Reservation> getDemandes() {
	        return demandes;
	    }

	    public void ajouterChambre(int numero, String type) {
	        Chambre chambre = new Chambre(numero, type);
	        chambres.put(numero, chambre);
	    }

	    public void modifierChambre(int numero, String type) {
	        if (chambres.containsKey(numero)) {
	            Chambre chambre = chambres.get(numero);
	            chambre.type = type;
	        }
	    }

	    public void supprimerChambre(int numero) {
	        if (chambres.containsKey(numero)) {
	            Chambre chambre = chambres.get(numero);
	            if (!chambre.estReservee()) {
	                chambres.remove(numero);
	            } else {
	                throw new RuntimeException("Impossible de supprimer une chambre déjà réservée");
	            }
	        }
	    }

	    public void ajouterDemande(Reservation demande) {
	        demandes.add(demande);
	    }

	    public void accepterDemande(int id) {
	        for (Reservation demande : demandes) {
	            if (demande.getId() == id) {
	                Chambre chambre = demande.getChambre();
	                if (!chambre.estReservee()) {
	                    chambre.reserver();
	                    demandes.remove(demande);
	                    break;
	                } else {
	                    throw new RuntimeException("La chambre est déjà réservée");
	                }
	            }
	        }
	    }

	    public void declinerDemande(int id) {
	        for (Reservation demande : demandes) {
	            if (demande.getId() == id) {
	                demandes.remove(demande);
	                break;
	            }
	        }
	    }
	}

