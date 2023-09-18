import java.time.LocalDate;

public class Prof extends Personne implements Cours{
    public Prof(int id, String nom, String prenom, LocalDate age, String profession) {
        super(id, nom, prenom, age, profession);
    }

    @Override
    public void assisteCours() {
        System.out.println("galère galère");
    }
}
