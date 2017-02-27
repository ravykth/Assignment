import java.util.*;

public class Employee {
    double salary;
    String holiday;
    int years;
    String lastName,birthDate,firstName;

    public Employee() {
    }

    public Employee(double salary, String holiday, int years, String lastName, String birthDate, String firstName) {
        this.salary = salary;
        this.holiday = holiday;
        this.years = years;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.firstName = firstName;
    }
    String getDataView(){
        return (this.salary+" "+this.holiday+" "+this.years+" "+this.lastName+" "+this.birthDate+" "+this.firstName);
    }
}

