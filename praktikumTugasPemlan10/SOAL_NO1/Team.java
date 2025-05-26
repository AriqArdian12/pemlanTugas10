import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public int getMinHeight() {
        return players.stream().mapToInt(Player::getTinggi).min().orElse(0);
    }

    public int getMaxHeight() {
        return players.stream().mapToInt(Player::getTinggi).max().orElse(0);
    }

    public int getMinWeight() {
        return players.stream().mapToInt(Player::getBerat).min().orElse(0);
    }

    public int getMaxWeight() {
        return players.stream().mapToInt(Player::getBerat).max().orElse(0);
    }
}
