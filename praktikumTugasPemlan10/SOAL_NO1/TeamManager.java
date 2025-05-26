import java.util.*;

public class TeamManager {
    private List<Team> teams = new ArrayList<>();

    public void addTeam(Team team) {
        teams.add(team);
    }

    public List<Player> getAllPlayers() {
        List<Player> all = new ArrayList<>();
        for (Team team : teams) {
            all.addAll(team.getPlayers());
        }
        return all;
    }

    public void sortPlayersByHeight(boolean ascending) {
        List<Player> players = getAllPlayers();
        players.sort(Comparator.comparingInt(Player::getTinggi));
        if (!ascending) Collections.reverse(players);

        System.out.println(ascending ? "Ascending (Menaik):" : "Descending (Menurun):");
        for (Player p : players) {
            System.out.println("  " + p);
        }
    }

    public void sortPlayersByWeight(boolean ascending) {
        List<Player> players = getAllPlayers();
        players.sort(Comparator.comparingInt(Player::getBerat));
        if (!ascending) Collections.reverse(players);

        System.out.println(ascending ? "Ascending (Menaik):" : "Descending (Menurun):");
        for (Player p : players) {
            System.out.println("  " + p);
        }
    }

    public Team copyTeam(Team original, String newName) {
        Team copy = new Team(newName);
        for (Player p : original.getPlayers()) {
            copy.addPlayer(new Player(p.getNomor(), p.getTinggi(), p.getBerat(), newName));
        }
        return copy;
    }
}
