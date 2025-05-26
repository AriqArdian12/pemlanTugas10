public class Main {
    public static void main(String[] args) {
        System.out.println("=== SOAL 2: IMPLEMENTASI BINARY SEARCH ===");

        TeamManager manager = new TeamManager();
        manager.initializeData();

        System.out.println("\n=== a. TAMPILKAN DATA TIM ===");
        manager.displayTeams();

        System.out.println("\n=== b. PENCARIAN TINGGI DI TIM B ===");
        Mencari.searchHeight(manager.getTimB(), 168);
        Mencari.searchHeight(manager.getTimB(), 160);

        System.out.println("\n=== c. PENCARIAN BERAT DI TIM A ===");
        Mencari.searchWeight(manager.getTimA(), 56);
        Mencari.searchWeight(manager.getTimA(), 53);

        System.out.println("\n=== d. KESAMAAN TINGGI / BERAT ===");
        manager.findCommonAttributes();
    }
}
