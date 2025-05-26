public interface ManagementAuth {
    String getEmail();
    void setEmail(String email);
    void setMotDePasse(String motDePasse);
    boolean seConnecter(String email, String motDePasse);
    void seDeconnecter();
}
