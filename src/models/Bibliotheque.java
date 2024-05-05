package models; 
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;

    public Bibliotheque(List<Livre> livres) {
        this.livres = livres;
    }

    public List<Livre> rechercherParTitre(String titre) {
        List<Livre> result = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                result.add(livre);
            }
        }
        return result;
    }

    public List<Livre> rechercherParAuteur(String auteur) {
        List<Livre> result = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getAuteur().equalsIgnoreCase(auteur)) {
                result.add(livre);
            }
        }
        return result;
    }

    public List<Livre> getLivresDisponibles() {
        List<Livre> result = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.estDisponible()) {
                result.add(livre);
            }
        }
        return result;
    }

    public List<Livre> getLivresEmpruntés() {
        List<Livre> result = new ArrayList<>();
        for (Livre livre : livres) {
            if (!livre.estDisponible()) {
                result.add(livre);
            }
        }
        return result;
    }

    public void emprunterLivre(String isbn) {
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn) && livre.estDisponible()) {
                livre.setDisponible(false);
                System.out.println("Livre emprunté avec succès: " + livre.getTitre());
                return;
            }
        }
        System.out.println("Livre non disponible ou ISBN invalide.");
    }

    public void retournerLivre(String isbn) {
        for (Livre livre : livres) {
            if (livre.getIsbn().equals(isbn) && !livre.estDisponible()) {
                livre.setDisponible(true);
                System.out.println("Livre retourné avec succès: " + livre.getTitre());
                return;
            }
        }
        System.out.println("Ce livre n'est pas actuellement emprunté ou ISBN invalide.");
    }

    public void afficherTousLesLivres() {
        System.out.println("Liste de tous les livres dans la bibliothèque :");
        for (Livre livre : livres) {
            System.out.println(livre.toString());
        }
    }
}

