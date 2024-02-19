import java.util.Date;

class Driver extends Person {      
    private String licenceCode;      
    public Driver(String idNumber, String name, Date dateOfBirth, String licenceCode) {         
        super(idNumber, name, dateOfBirth);         
        this.licenceCode = licenceCode;     
    }      
    @Override     
    public int compareTo(Person p) {         
        if (this.getIdNumber().equals(p.getIdNumber()) && this.getName().equals(p.getName())                 
        && this.getDateOfBirth().equals(p.getDateOfBirth())) { 
            return 1;         
        }          
        else {             
            return 0;         
        }     
    }      
    public void giveRide(RideRecord.RideType rideType, double fee, Passenger passenger) {         
        passenger.takeRide(new RideRecord(rideType, fee));     
    } 
}
