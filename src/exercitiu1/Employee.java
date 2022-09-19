package exercitiu1;

import java.time.LocalDate;

public class Employee implements Person{

    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String address;

    private LocalDate dateOfEmployment;
    private  String position;

    public Employee(String firstName, String lastName, LocalDate birthDay, String address, LocalDate dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return this.birthDay ;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    public String getPosition() {
        return position;
    }
}