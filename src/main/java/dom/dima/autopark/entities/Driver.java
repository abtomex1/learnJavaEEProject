package dom.dima.autopark.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Driver extends AbstractEntity {
    private String tabelNumber;
    private String lastName;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private int age;
    private Date dateOfEmployment;

    public Driver(String tabelNumber, String lastName, String firstName, String secondName, Date birthDate, int age, Date dateOfEmployment) {
        this.tabelNumber = tabelNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.age = age;
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString(){
        return "{" +
                tabelNumber + ", " +
                lastName + ", " +
                firstName + ", " +
                secondName + ", " +
                birthDate + ", " +
                age + ", " +
                dateOfEmployment +
                "}";

    }

}
