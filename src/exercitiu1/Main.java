package exercitiu1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        Employee angajat = new Employee("Mihai","Popescu", LocalDate.of(1969,2,24),
                "Bucuresti",LocalDate.of(2000,3,24),"inginer");

        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd.mm.yyyy");


        System.out.println(String.format("Angajatul cu numele %s %s , cu domiciliul in %s este angajat pe postul %s ",
                angajat.getLastName(),
                angajat.getFirstName(),
               // angajat.getBirthday().format(dataFormat),
                angajat.getAddress(),
                angajat.getPosition()));
                //  angajat.getDateOfEmployment().format(dataFormat)));

       Programmer programator = new Programmer("Ioana", "Vasilescu",
               LocalDate.of(1997,4,8),"Prahova",LocalDate.of(2020,3,5),"test","java");

        System.out.println("Nume " + programator.getLastName() + " " + programator.getFirstName() + " din " + programator.getAddress()
                + " angajat in postul de " +
                programator.getPosition() + " limbaj " + programator.getLanguage());


        DatabaseAdmin administrator = new DatabaseAdmin("Diana","Popa", LocalDate.of(1997,10,2),
                "Constanta", LocalDate.of(2020,2,11),"Administrator","Oracle");

        System.out.println(String.format("%s %s din %s este angajata in postul de %s - %s",
                administrator.getLastName(),
                administrator.getFirstName(),
                administrator.getAddress(),
                administrator.getPosition(),
                administrator.getDbTechnology()));

    }
}
