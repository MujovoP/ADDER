import java.util.*;

public class contactTracing {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int NoB = n.nextInt();

        System.out.println("Enter arrival time(ai)");
        int[] ai = new int[NoB];
        System.out.println("Enter departure time(di)");
        int[] di = new int[NoB];

        for (int i = 0; i<NoB; i++) {
            ai[i] = n.nextInt();
            di[i] = n.nextInt();
        }
        ArrayList<String> BP = new ArrayList<String>();

        for (int i = 0; i<NoB; i++) {
            for (int j = i+1; j<NoB; j++) {
                if (ai[j] < di[i] && ai[i] < di[j]) {
                    BP.add("("+(i+1) + "," + (j+1) + ")");
                }
            }
        }
        
    System.out.println("Number of pairs of babies who are at creche" + BP.size());
    System.out.println("Pairs of babies who are at creche" + BP);

    n.close();
}
}
