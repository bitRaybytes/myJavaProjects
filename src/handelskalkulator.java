package JavaProjects.src;
import java.math.RoundingMode;
import java.util.Scanner;
public class handelskalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Handelskalkulator");
        System.out.println("Bitte trage deine Werte ein:");
        System.out.println();

        System.out.print("Listenpreis: ");
        double listenpreis = input.nextDouble();

        System.out.print("Lieferrantenrabatt: ");
        double lieferrantenrabatt = input.nextDouble();

        double zieleinkaufspreis = listenpreis - lieferrantenrabatt;
        System.out.println("Zieleinkaufspreis: " + zieleinkaufspreis);

        System.err.print("Lieferantenskonto: ");
        double Lieferantenskonto = input.nextDouble();
        double bareinkaufspreis = zieleinkaufspreis - ((zieleinkaufspreis*Lieferantenskonto)/100);
        System.out.print("Bareinkaufspreis: " + bareinkaufspreis);
        System.out.println();
        System.out.print("Bezugskosten: ");
        double bezugskosten = input.nextDouble();
        double einstandspreis = bareinkaufspreis + bezugskosten;
        System.out.println("Einstandspreis: " + einstandspreis);

        System.out.print("Gemeinkosten: ");
        double gemeinkosten = input.nextDouble();

        double selbstkosten = einstandspreis + ((einstandspreis * gemeinkosten)/100);
        System.out.println("Selbstkosten: " + selbstkosten);
        
        System.out.print("Gewinnzuschlag: ");
        double gewinnzuschlag = input.nextDouble();
        double barverkaufspreis = selbstkosten + ((selbstkosten * gewinnzuschlag)/100);
        System.out.print("Barverkaufspreis: " + barverkaufspreis);
        System.out.println();
        System.out.print("Kundenskonto: ");
        double kundenskonto = input.nextDouble();
        double zielverkaufspreis = barverkaufspreis + ((barverkaufspreis * kundenskonto)/(100 - kundenskonto));
        System.out.println("Zielverkaufspreis: "+ zielverkaufspreis);

        System.out.print("Kundenrabatt: ");
        double kundenrabatt = input.nextDouble();

        double nettoverkaufspreis = zielverkaufspreis + ((zielverkaufspreis * kundenrabatt)/ (100 - kundenrabatt));
        System.out.println("Nettoverkaufspreis: "+ nettoverkaufspreis);
        
        System.out.print("Umsatzsteuer: ");
        double umsatzsteuer = input.nextDouble();
        double bruttoverkaufspreis = nettoverkaufspreis + ((nettoverkaufspreis * umsatzsteuer)/100);
        double bruttoVkGerundet = new bruttoverkaufspreis(bruttoverkaufspreis).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Bruttoverkaufspreis: " + bruttoVkGerundet);

    }
}
