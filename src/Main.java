import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        B b = new B();

        Personne p1 = new Personne(1, "nom1", "prenom1", LocalDate.now(), "profession");

        System.out.println(b.f(a));
        System.out.println(b.f(ab));
        System.out.println(b.f(b));
    }
}