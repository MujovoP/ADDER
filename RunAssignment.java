import java.util.Date;
public class RunAssignment {
  public static void main(String[] args) {
    Driver goliath = new Driver("6405013145087", "John Goliath",
                                new Date(-178934400000L), "CAA202210");
    Passenger david =
        new Passenger("9906014269088", "David Chord", new Date(928195200000L));
    System.out.printf("Name: %s\nRSA ID:%s\nDOB:%s\nHas ride history?: %b\n",
                      david.getName(), david.getIdNumber(),
                      david.getDateOfBirth(), david.hasRideHistory());
    goliath.giveRide(RideRecord.RideType.KUDU, 56.00, david);
    System.out.println("----------------------------");
    System.out.printf("Name: %s\nRSA ID:%s\nDOB:%s\nHas ride history?: %b\n",
                      david.getName(), david.getIdNumber(),
                      david.getDateOfBirth(), david.hasRideHistory());
  }
}
