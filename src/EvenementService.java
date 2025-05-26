import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EvenementService implements ManagementEvenement {
    private List<Evenement> evenements = new ArrayList<Evenement>();

    public Evenement creerEvenement(String titre, LocalDateTime date, String description, Utilisateur auteur) {
        Evenement evenement = new Evenement();
        evenement.setNom(titre);
        evenement.setDescription(description);
        evenement.setDate(date);
        evenement.setAuteur(auteur);
        return evenement;
    }

    public boolean modifierEvenement(Evenement evenement, String nouveauTexte) {
        if (evenements.contains(evenement)) {
            evenement.setDescription(nouveauTexte);
            return true;
        }
        return false;
    }

    public boolean supprimerEvenement(Evenement evenement) {
        return evenements.remove(evenement);
    }

    public List<Evenement> getTousLesEvenements() {
        return new ArrayList<>(evenements);
    }
}
