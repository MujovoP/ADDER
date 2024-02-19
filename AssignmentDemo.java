import java.text.DecimalFormat;
import java.util.ArrayList;
   
   abstract class Vehicle {    
          
     protected String name;     
     protected double charge;     
           
    public String getName() {        
    return this.name; }     
    public double getCharge() {       
    return this.charge; }     
    public void setName(String Name) {      
    this.name = Name; }     
    public void setCharge(double Charge) {         
    this.charge = Charge; } 
    abstract void printInfo();
    abstract double calculateChargeNeeded(); }
     
    interface Dockable {    
    public boolean canDock();    
    public int dock(Vehicle vehicle); }  
           
    class ChargingStation extends Vehicle implements Dockable {    
                  
    private ArrayList<Vehicle> dockedVehicles = new ArrayList<Vehicle>(); 
                 
    private int dockingCapacity; 
                 
    public ChargingStation(String Name, double Charge, int DockingCapacity)     {  
    this.name = Name;         
    this.charge = Charge;         
    this.dockingCapacity = DockingCapacity;   }      
                    
    public int getDockingCapacity() {        
    return dockingCapacity;     }      
    public void setDockingCapacity(int dockingCapacity) {         
    this.dockingCapacity = dockingCapacity;     }     
                            
    public boolean canDock()     {        
    if(dockedVehicles.size() < this.dockingCapacity)         { 
    return true;         }         
    else         {             
    return false;         }     }      
    public int dock(Vehicle vehicle)     {         
    if(dockedVehicles.size() < this.dockingCapacity)         {            
    dockedVehicles.add(vehicle);             
    return dockedVehicles.size() -1;         }        
                else         {            
                return -1;         }     }      
                public double calculateChargeNeeded()     {         
                double Chargeneeded = this.charge;         
                for(Vehicle vehicle : dockedVehicles)         {             
                Chargeneeded += vehicle.getCharge();         }         
                return Chargeneeded;     }      
                public void printInfo()     {         
                DecimalFormat df = new DecimalFormat("####0.0");         
                System.out.println("Name : " + this.name);         
                System.out.println("Charge Needed : " + df.format(this.calculateChargeNeeded()) + "%");         
                System.out.println("Docked vehicles :");                           
                if(dockedVehicles.size() > 0)         {             
                for(Vehicle vehicle : dockedVehicles)             {                 
                System.out.println(vehicle.getName());             }         }         
                else         {             
                    System.out.println("none");        
                 }    
                 }     
                  }   
                
                class TestVehicle extends Vehicle {     
                        
                public TestVehicle(String Name, double Charge)     {         
                this.name = Name;        
                this.charge = charge;     }      
                    
                public double calculateChargeNeeded()     {         
                return this.charge;     }      
                public void printInfo()     {        
                DecimalFormat df = new DecimalFormat("####0.0");         
                System.out.println("Name : " + this.name);         
                System.out.println("Charge Needed : " + df.format(this.charge) + "%");     } }  
                  
                public class AssignmentDemo {

                  public static void main(String[] args) {
                    ChargingStation chargePrime = new ChargingStation("Prime", 5);
                    TestVehicle dragon = new TestVehicle("Dragon", 500);
                
                    dragon.setChargeRemaining(100);
                
                    System.out.println("> Station info:");
                    chargePrime.printInfo();
                
                    System.out.println("> A vehicle can dock at the station: " +
                                       chargePrime.canDock());
                
                    System.out.println("> Approaching vehicle info:");
                    dragon.printInfo();
                
                    int bayNumber = chargePrime.dock(dragon);
                    System.out.println("> Vehicle docked in bay number " + bayNumber);
                
                    System.out.println("> Station info:");
                    chargePrime.printInfo();
                
                    System.out.println("> A vehicle can dock at the station: " +
                                       chargePrime.canDock());
                
                    TestVehicle unicorn = new TestVehicle("Unicorn", 500);
                    unicorn.setChargeRemaining(100);
                
                    System.out.println("> Approaching vehicle info:");
                    unicorn.printInfo();
                
                    bayNumber = chargePrime.dock(unicorn);
                    System.out.println("> Vehicle docked in bay number " + bayNumber);
                
                    System.out.println("> Station info:");
                    chargePrime.printInfo();
                
                    System.out.println("> A vehicle can dock at the station: " +
                                       chargePrime.canDock());
                  }
                }