import java.time.LocalDate;
import java.time.Period;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate age;
    private String profession;

    public Personne(int id, String nom,
                    String prenom,
                    LocalDate age,
                    String profession) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.profession = profession;
    }

    public Personne(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return Period.between(this.age, LocalDate.now()).getYears();
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }

    protected void jeFaisLaFete(){
         System.out.println("Bof - Jamais");
    }
}
