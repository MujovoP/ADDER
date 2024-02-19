import java.util.Date;

class RideRecord {      
    enum RideType {         DUIKER,         KUDU,         TEMBO   }      
    private RideType type;     
    private Date date;     
    private double fee;      
    public RideRecord(RideType type, double fee) {         
        this.type = type;         
        this.fee = fee;    
     } 
    }  
