import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EvenementService evenementService = new EvenementService();
        CommentaireService commentaireService = new CommentaireService();
        AuthentificationService authentificationService = new AuthentificationService();

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("John Doe");
        utilisateur.setEmail("JohnDoe@gmail.com");

        Evenement evenement = evenementService.creerEvenement(
                "Conférence Java",
                LocalDateTime.of(2025,6,15,10,0),
                "Présentation sur les bonnes pratiques Java",
                utilisateur
        );

        Commentaire commentaire = commentaireService.ajouterCommentaire(
                "Super événement !",
                utilisateur,
                evenement
        );

        List<Commentaire> commentaires = commentaireService.getCommentairePourEvenement(evenement);
        System.out.println("Liste des commentaires :");
        for (Commentaire c : commentaires) {
            System.out.println("- Auteur " + c.getAuteur().getNom());
            System.out.println(" Email: " + c.getAuteur().getEmail());
            System.out.println(" ID: " + c.getAuteur().getId());
            System.out.println(" Evenement: " + c.getEvenement().getNom());
            System.out.println(" Commentaire :" + c.getTexte());
        }
    }
}
