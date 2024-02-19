
import java.util.Date;
abstract class Person {
private String idNumber;    
private String name;   
private Date dateOfBirth;      
public Person(String idNumber, String name, Date dateOfBirth) {         
    this.idNumber = idNumber;         
    this.name = name;         
    this.dateOfBirth = dateOfBirth;    
 }      public String getIdNumber() {         
    return idNumber;     
}      public String getName() {         
    return name;     
}      public Date getDateOfBirth() {         
    return dateOfBirth;     
}      
abstract public int compareTo(Person p);  }  

