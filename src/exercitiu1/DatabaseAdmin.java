package exercitiu1;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee{

    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, LocalDate birthDay, String address, LocalDate dateOfEmployment, String position, String dbTechnology) {
        super(firstName, lastName, birthDay, address, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin " + super.getAddress();


    }
   }
