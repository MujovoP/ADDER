// Surname: MUJOVO
// Name: PAULOS
// Student no: 4125570
// Course: CSC211
// Year: 2023
// Assignment: Practical 2 Term 2
// File: FlightNode.java


import java.util.Date;

public class FlightNode {
    
    private String registration_no; 
    private Date arrival_date; 
    
    public FlightNode() {
        this.registration_no = "";
        this.arrival_date = null;
    }
    
    public FlightNode(String registration_no, Date arrival_date) {
        this.registration_no = registration_no;
        this.arrival_date = arrival_date;
    }
    
    public String getRegistrationNo() {
        return registration_no;
    }
    
    public Date getArrivalDate() {
        return arrival_date;
    }
    
    public void setRegistrationNo(String registration_no) {
        this.registration_no = registration_no;
    }
    
    public void setArrivalDate(Date arrival_date) {
        this.arrival_date = arrival_date;
    }
    
    public String toString() {
        return "Flight registration no.: " + registration_no + "\n" +
               "Arrival date: " + arrival_date.toString();
    }
}
