import java.util.List;

public interface ManagementCommentaire {
    Commentaire ajouterCommentaire(String texte, Utilisateur auteur, Evenement evenement);
    boolean modifierCommentaire(Commentaire commentaire, String nouveauTexte);
    boolean supprimerCommentaire(Commentaire commentaire);
    List<Commentaire> getCommentairePourEvenement(Evenement evenement);
}
