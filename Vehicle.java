class Vehicle {    
protected String name;     
protected double weight;     
          
public String getName() {        
return this.name; 
}     
public double getWeight() {       
return this.weight; 
}     
public void setName(String Name) {      
this.name = Name; 
}     
public void setWeight(double Weight) {         
this.weight = Weight; 
} 
abstract void printInfo();
abstract double calculateTotalWeight();
 }
