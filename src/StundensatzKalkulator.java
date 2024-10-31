package JavaProjects.src;

import java.util.Scanner;
public class StundensatzKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // grossvalue
       System.out.print("gewünschtes Bruttogehalt: ");
       double grossValue = input.nextInt();
       // socialinsurance
       System.out.print("Sozialversicherung in %: ");
       double socialInsuranceRate = input.nextInt();
       // calculation for the socialinsurance amount
       double socialinsurance = (grossValue * socialInsuranceRate) / 100;
       // Print line for social insurance amount
       System.out.println("Sozialversicherungsbeitrag: " + socialinsurance + "€");
       // occupational rate
       double occupationalRate = 75.0;
       System.out.println("Berufsunfähigkeitsversicherung: " + occupationalRate);
       // retirement plan - by default 10%
       double retirementPlanning = (grossValue * 10)/100;
       System.out.println("Altersvorsorge (10%): " + retirementPlanning );
       // subtotal
       double subtotal = (grossValue + socialinsurance + occupationalRate+ retirementPlanning);
       System.out.println("Zwischensumme: " + subtotal);
       System.out.println();


       // further costs
       System.out.println("Weitere Kosten");
       System.out.println("Trage deine Kosten für dieses Jahr ein:");
       System.out.print("Miete: ");
       double rent = input.nextInt();
       System.out.print("Marketing: ");
       double marketing = input.nextInt();
       System.out.print("Verwaltung: ");
       double management = input.nextInt();
       System.out.print("Lieferanten: ");
       double suppliers = input.nextInt();
       System.out.print("Betriebliche Versicherung: ");
       double comInsurance = input.nextInt();
       System.out.print("Finanzierung: ");
       double finance = input.nextInt();
       System.out.print("Werkzeuge/Software: ");
       double utilities = input.nextInt();
       System.out.print("sonstige Ausgaben: ");
       double extras = input.nextInt();
       // calculating total costs
       double totalCosts = (rent+marketing+management+suppliers+comInsurance+finance+utilities+extras);
       System.out.println("Gesamtkosten: " + totalCosts);
      
       // utilization
       System.out.println("Auslastung im Jahr");
       // defining calendar days and weekends for a year
       int calendarDays = 360;
       int weekends = 104;
       System.out.println("Kalendertage: standard " + calendarDays);
       System.out.println("Wochenenden in d: "+ weekends);
       System.out.print("Feiertage: ");
       int holidays = input.nextInt();
       System.out.print("Urlaubstage: ");
       int vacation = input.nextInt();
       System.out.print("geschätzter Krankenstand: ");
       int sickleave = input.nextInt();
       System.out.print("Weiterbildungsmaßnahme: ");
       int education = input.nextInt();
       int workDaysYearly = (calendarDays - weekends - holidays - vacation - sickleave - education);
       int workDaysMonthly = workDaysYearly / 12;
       System.out.println("Arbeitstage pro Jahr: " + workDaysYearly);
       System.out.println("Arbeitsage pro Monat: " + workDaysMonthly);
       System.out.print("geschätzte Auslastung in %: ");
       int utilization = input.nextInt();
       int utilizationMonth = utilization * workDaysMonthly / 100;
       System.out.println("Produktivität im Monat: " + utilizationMonth);


       // billable work
       System.out.println();
       System.out.println("Stundensatz errechnen:");
       System.out.println();
       double globalCosts = subtotal * 12 + totalCosts;
       System.out.println("Deine Gesamtkosten belaufen sich auf: " + globalCosts);   
       int billableWork = utilizationMonth * 12;
       System.out.println("Abrechenbare Arbeitsstunden: " + billableWork);
       System.out.println("Arbeitsstunden pro Tag: " + totalCosts/billableWork);
       double workHoursDaily = 8.0; // if needed change the value of daily working hours
       int eachHour = (((int) totalCosts)/billableWork)/(int)workHoursDaily;
       System.out.println("Arbeitsstunden pro Tag: " + eachHour);
       System.out.print("Finanzierungskosten: ");
       int billingCosts = input.nextInt();
       System.out.print("Gewinnmarge: ");
       int revenue = input.nextInt();
       int netHourlyRate = eachHour *(1+billingCosts) * (1+revenue);
       System.out.println("Netto Stundensatz: " + netHourlyRate);
       double vat = netHourlyRate * 1.19;
       System.out.println("zzgl 19% MwSt.: "+ vat);


       input.close();
   }
}
