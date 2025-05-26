import java.util.UUID;

public class Utilisateur {
    private UUID id;
    private String nom;
    private String email;
    private String motDePasse;

    public Utilisateur() {
        this.id = UUID.randomUUID();
    }

    public Utilisateur(UUID id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
