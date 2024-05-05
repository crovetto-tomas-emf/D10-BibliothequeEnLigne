package app;

public class Application {

    public static void main(String[] args) {
  
           
           
           livre.add(new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", "9782070643027", true));
           livre.add(new Livre("Le Seigneur des Anneaux : La Communauté de l'Anneau", "J.R.R. Tolkien", "9782266283611", true));
           livre.add(new Livre("1984", "George Orwell", "9782070345096", true));
           livre.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "9782070628642", false));
           livre.add(new Livre("To Kill a Mockingbird", "Harper Lee", "9780061120084", true));
   
           // Création de la bibliothèque
           Bibliotheque bibliotheque = new Bibliotheque(livres);
   
           // Opérations sur les livres
           Bibliotheque.afficherTousLesLivres();
           System.out.println("Livres disponibles : ");
           Bibliotheque.getLivresDisponibles().forEach(System.out::println);
   
           System.out.println("\nRecherche par auteur 'J.K. Rowling' : ");
           Bibliotheque.rechercherParAuteur("J.K. Rowling").forEach(System.out::println);
   
           System.out.println("\nEmprunter un livre (ISBN: 9782070643027) : ");
           Bibliotheque.emprunterLivre("9782070643027");
   
           System.out.println("\nLivres disponibles après l'emprunt : ");
           Bibliotheque.getLivresDisponibles().forEach(System.out::println);
   
           System.out.println("\nLivres empruntés : ");
           Bibliotheque.getLivresEmpruntés().forEach(System.out::println);
   
           System.out.println("\nRetourner un livre (ISBN: 9782070643027) : ");
           Bibliotheque.retournerLivre("9782070643027");
   
           System.out.println("\nLivres disponibles après le retour : ");
           Bibliotheque.getLivresDisponibles().forEach(System.out::println);
       }
   }
   


