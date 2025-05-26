import java.util.*;

public class Mencari {

    public static void searchHeight(ArrayList<Player> team, int target) {
        System.out.println("Mencari tinggi: " + target + " cm");
        ArrayList<Player> found = new ArrayList<>();
        for (Player p : team) {
            if (p.getTinggi() == target) found.add(p);
        }
        System.out.println("Ditemukan " + found.size() + " pemain:");
        for (Player p : found) System.out.println("  " + p);

        int[] heights = team.stream().mapToInt(Player::getTinggi).sorted().toArray();
        int idx = binarySearch(heights, target);
        System.out.println("Binary Search: " + (idx >= 0 ? "Ditemukan di index " + idx : "Tidak ditemukan"));
    }

    public static void searchWeight(ArrayList<Player> team, int target) {
        System.out.println("Mencari berat: " + target + " kg");
        ArrayList<Player> found = new ArrayList<>();
        for (Player p : team) {
            if (p.getBerat() == target) found.add(p);
        }
        System.out.println("Ditemukan " + found.size() + " pemain:");
        for (Player p : found) System.out.println("  " + p);

        int[] weights = team.stream().mapToInt(Player::getBerat).sorted().toArray();
        int idx = binarySearch(weights, target);
        System.out.println("Binary Search: " + (idx >= 0 ? "Ditemukan di index " + idx : "Tidak ditemukan"));
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
