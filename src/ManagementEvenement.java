import java.time.LocalDateTime;
import java.util.List;

public interface ManagementEvenement {
    Evenement creerEvenement(String titre, LocalDateTime date, String description, Utilisateur auteur);
    boolean modifierEvenement(Evenement evenement, String nouveauTexte);
    boolean supprimerEvenement(Evenement evenement);
    List<Evenement> getTousLesEvenements();

}
