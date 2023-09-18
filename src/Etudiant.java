import java.time.LocalDate;

public class Etudiant extends Personne implements Cours{
    private int rythmeSoirreDeLaStreet;

    public Etudiant(int id, String nom, String prenom, LocalDate age, String profession, int rythmeSoirreDeLaStreet) {
        super(id, nom, prenom, age, profession);
        this.rythmeSoirreDeLaStreet = rythmeSoirreDeLaStreet;
    }

    public int getRythmeSoirreDeLaStreet() {
        return rythmeSoirreDeLaStreet;
    }

    public void setRythmeSoirreDeLaStreet(int rythmeSoirreDeLaStreet) {
        this.rythmeSoirreDeLaStreet = rythmeSoirreDeLaStreet;
    }

    @Override
    protected void jeFaisLaFete(){
        System.out.println("Tous les jours");
    }

    @Override
    public void assisteCours() {
        System.out.println("Je fais style je joue a fortnite");
    }
}
