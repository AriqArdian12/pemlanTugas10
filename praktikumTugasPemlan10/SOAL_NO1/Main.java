public class Main {
    public static void main(String[] args) {
        Team timA = new Team("A");
        Team timB = new Team("B");

        // Inisialisasi data Tim A dan B
        initializeTeamA(timA);
        initializeTeamB(timB);

        TeamManager manager = new TeamManager();
        manager.addTeam(timA);
        manager.addTeam(timB);

        System.out.println("=== SOAL 1: SORTING DAN ANALISIS DATA TIM ===\n");

        // a. Sorting tinggi
        System.out.println("a. SORTING BERDASARKAN TINGGI BADAN:");
        manager.sortPlayersByHeight(true);   // Ascending
        manager.sortPlayersByHeight(false);  // Descending

        // b. Sorting berat
        System.out.println("\nb. SORTING BERDASARKAN BERAT BADAN:");
        manager.sortPlayersByWeight(true);   // Ascending
        manager.sortPlayersByWeight(false);  // Descending

        // c. Min/Max
        System.out.println("\nc. NILAI MAKSIMUM DAN MINIMUM:");
        printTeamStats(timA);
        printTeamStats(timB);

        // d. Copy Tim B ke Tim C
        System.out.println("\nd. COPY TIM B KE TIM C:");
        Team timC = manager.copyTeam(timB, "C");
        for (Player p : timC.getPlayers()) {
            System.out.println("  " + p);
        }
        System.out.println("\nTotal pemain di Tim C: " + timC.getPlayers().size() + " pemain");
    }

    private static void initializeTeamA(Team team) {
        team.addPlayer(new Player(1, 168, 50, "A"));
        team.addPlayer(new Player(2, 170, 60, "A"));
        team.addPlayer(new Player(3, 165, 56, "A"));
        team.addPlayer(new Player(4, 168, 55, "A"));
        team.addPlayer(new Player(5, 172, 60, "A"));
        team.addPlayer(new Player(6, 170, 70, "A"));
        team.addPlayer(new Player(7, 169, 66, "A"));
        team.addPlayer(new Player(8, 165, 56, "A"));
        team.addPlayer(new Player(9, 171, 72, "A"));
        team.addPlayer(new Player(10, 166, 56, "A"));
    }

    private static void initializeTeamB(Team team) {
        team.addPlayer(new Player(1, 170, 66, "B"));
        team.addPlayer(new Player(2, 167, 60, "B"));
        team.addPlayer(new Player(3, 165, 59, "B"));
        team.addPlayer(new Player(4, 166, 58, "B"));
        team.addPlayer(new Player(5, 168, 58, "B"));
        team.addPlayer(new Player(6, 175, 71, "B"));
        team.addPlayer(new Player(7, 172, 68, "B"));
        team.addPlayer(new Player(8, 171, 68, "B"));
        team.addPlayer(new Player(9, 168, 65, "B"));
        team.addPlayer(new Player(10, 169, 60, "B"));
    }

    private static void printTeamStats(Team team) {
        System.out.println("Tim " + team.getName() + ":");
        System.out.println("  Tinggi Badan - Min: " + team.getMinHeight() + " cm, Max: " + team.getMaxHeight() + " cm");
        System.out.println("  Berat Badan - Min: " + team.getMinWeight() + " kg, Max: " + team.getMaxWeight() + " kg");
    }
}
