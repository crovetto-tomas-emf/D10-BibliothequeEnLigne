package models; 

public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;

    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String status = disponible ? "Disponible" : "Emprunté";
        return "Titre: " + titre + ", Auteur: " + auteur + ", ISBN: " + isbn + ", Statut: " + status;
    }
}
