import java.util.ArrayList;
import java.util.Date;

class Passenger extends Person {      
    private ArrayList<RideRecord> rideRecord = new ArrayList<>();     
    public Passenger(String idNumber, String name, Date dateOfBirth) {         
    super(idNumber, name, dateOfBirth);     
    }      
    @Override     
    public int compareTo(Person p) {         
    if (this.getIdNumber().equals(p.getIdNumber()) && this.getName().equals(p.getName())     
    && this.getDateOfBirth().equals(p.getDateOfBirth())) 
    {             
        return 1;         
     }          
    else {             
        return 0;       
      }     
    }      
    public void takeRide(RideRecord rideRecord) {         
        rideRecord.add(rideRecord);     
    }      
    public boolean hasRideHistory() {         
        return !rideRecord.isEmpty();     
    } 
}  
