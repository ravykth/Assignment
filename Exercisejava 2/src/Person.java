import java.util.*;
public class Person extends DCommon {
    String birthDate,firstName,lastName;

    public Person(String birthDate, String firstName, String lastName, int id, String CreatedDate, String UpdatedDate, String Createdby, String Updatedby, String State, String Version) {
        super(id, CreatedDate, UpdatedDate, Createdby, Updatedby, State, Version);
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getbirthDate(){
        return birthDate;
    }
    String getfirstName(){
        return firstName;
    }
    String getlastName(){
        return lastName;
    }
    void print(){
        super.print();
        System.out.println("BithDate: "+birthDate+"FirstName: "+firstName+"LastName: "+lastName);
    }
}
