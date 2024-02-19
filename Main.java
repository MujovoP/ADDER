// Surname: MUJOVO
// Name: PAULOS
// Student no: 4125570
// Course: CSC211
// Year: 2023
// Assignment: Practical 2 Term 2
// File: Main.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<FlightNode> heap = new PriorityQueue<FlightNode>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            BufferedReader br = new BufferedReader(new FileReader("planes.csv"));
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String regNo = parts[0];
                Date departureTime = formatter.parse(parts[1]);
                String[] durationParts = parts[2].split(":");
                int hours = Integer.parseInt(durationParts[0]);
                int minutes = Integer.parseInt(durationParts[1]);
                int seconds = Integer.parseInt(durationParts[2]);
                long durationMillis = (hours * 60 * 60 + minutes * 60 + seconds) * 1000;
                Date arrivalTime = new Date(departureTime.getTime() + durationMillis);
                FlightNode flight = new FlightNode(regNo, arrivalTime);
                heap.add(flight);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        while (!heap.isEmpty()) {
            System.out.println(heap.poll().toString());
        }
    }

    public static Date format(int day, int month, int year, int hours, int minutes, int seconds) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateString = day + "/" + month + "/" + year + " " + hours + ":" + minutes + ":" + seconds;
        try {
            Date date = formatter.parse(dateString);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
