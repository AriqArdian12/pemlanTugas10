import java.util.*;

public class TeamManager {
    private ArrayList<Player> timA = new ArrayList<>();
    private ArrayList<Player> timB = new ArrayList<>();

    public void initializeData() {
        // Tim A
        timA.add(new Player(1, 168, 50, "A"));
        timA.add(new Player(2, 170, 60, "A"));
        timA.add(new Player(3, 165, 56, "A"));
        timA.add(new Player(4, 168, 55, "A"));
        timA.add(new Player(5, 172, 60, "A"));
        timA.add(new Player(6, 170, 70, "A"));
        timA.add(new Player(7, 169, 66, "A"));
        timA.add(new Player(8, 165, 56, "A"));
        timA.add(new Player(9, 171, 72, "A"));
        timA.add(new Player(10, 166, 56, "A"));

        // Tim B
        timB.add(new Player(1, 170, 66, "B"));
        timB.add(new Player(2, 167, 60, "B"));
        timB.add(new Player(3, 165, 59, "B"));
        timB.add(new Player(4, 166, 58, "B"));
        timB.add(new Player(5, 168, 58, "B"));
        timB.add(new Player(6, 175, 71, "B"));
        timB.add(new Player(7, 172, 68, "B"));
        timB.add(new Player(8, 171, 68, "B"));
        timB.add(new Player(9, 168, 65, "B"));
        timB.add(new Player(10, 169, 60, "B"));
    }

    public ArrayList<Player> getTimA() { return timA; }
    public ArrayList<Player> getTimB() { return timB; }

    public void displayTeams() {
        System.out.println("Data Tim A:");
        for (Player p : timA) System.out.println("  " + p);
        System.out.println("Data Tim B:");
        for (Player p : timB) System.out.println("  " + p);
    }

    public void findCommonAttributes() {
        boolean foundHeight = false, foundWeight = false;

        System.out.println("Kesamaan Tinggi Badan:");
        for (Player a : timA) {
            for (Player b : timB) {
                if (a.getTinggi() == b.getTinggi()) {
                    System.out.println("  " + a + " = " + b);
                    foundHeight = true;
                }
            }
        }
        if (!foundHeight) System.out.println("  Tidak ada kesamaan tinggi.");

        System.out.println("Kesamaan Berat Badan:");
        for (Player a : timA) {
            for (Player b : timB) {
                if (a.getBerat() == b.getBerat()) {
                    System.out.println("  " + a + " = " + b);
                    foundWeight = true;
                }
            }
        }
        if (!foundWeight) System.out.println("  Tidak ada kesamaan berat.");
    }
}
