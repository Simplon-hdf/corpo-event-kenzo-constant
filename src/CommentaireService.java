import java.util.ArrayList;
import java.util.List;

public class CommentaireService implements ManagementCommentaire {
    private List<Commentaire> commentaires = new ArrayList<Commentaire>();

    public Commentaire ajouterCommentaire(String texte, Utilisateur auteur, Evenement evenement) {
        Commentaire commentaire = new Commentaire();
        commentaire.setTexte(texte);
        commentaire.setAuteur(auteur);
        commentaire.setEvenement(evenement);
        commentaires.add(commentaire);
        return commentaire;
    }

    public boolean modifierCommentaire(Commentaire commentaire, String nouveauTexte) {
        if (commentaires.contains(commentaire)) {
            commentaire.setTexte(nouveauTexte);
            return true;
        }
        return false;
    }

    public boolean supprimerCommentaire(Commentaire commentaire) {
        commentaires.remove(commentaire);
        return false;
    }

    public List<Commentaire> getCommentairePourEvenement(Evenement evenement) {
        List<Commentaire> result = new ArrayList<>();
        for (Commentaire commentaire : commentaires) {
            if (commentaire.getEvenement().equals(evenement)) {
                result.add(commentaire);
            }
        }
        return result;
    }
}
