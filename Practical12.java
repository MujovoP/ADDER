import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practical12 {
    public static void main(String[] args) {
        File file = new File("Rhyme.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File newFile = new File("Rhyme2.txt");
        FileWriter writer = null;
        int verseNumber = 1;
        int lineNumber = 1;
        try{
            writer = new FileWriter(newFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                writer.write("[" + verseNumber + "] [" + lineNumber + "] " + line + "\n");
                lineNumber++;

                if (line.equals("")) {
                    verseNumber++;
                    lineNumber = 1;
                }
            }
            writer.write("\n[Paulos] [4125570]");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
