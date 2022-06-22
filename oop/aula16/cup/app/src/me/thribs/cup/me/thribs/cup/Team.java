package me.thribs.cup;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String name;
    private final List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addPlayers(List<Player> players) {
        this.players.addAll(players);
    }

    public List<Player> sortPlayersByJerseyNumber() {
        List<Player> playersByJerseyNumber = new ArrayList<>();
        for (Player player : players) {
            playersByJerseyNumber.add(player);
        }
        playersByJerseyNumber.sort((Player player1, Player player2) -> player1.getJerseyNumber().compareTo(player2.getJerseyNumber()));
        return playersByJerseyNumber;
    }

    public List<Player> getBenchedPlayers() {
        List<Player> benchedPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getEscalation() == Escalation.BENCH) {
                benchedPlayers.add(player);
            }
        }
        return benchedPlayers;
    }

    public List<Player> getPlayersByPosition(Position position) {
        List<Player> playersByPosition = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition() == position) {
                playersByPosition.add(player);
            }
        }
        return playersByPosition;
    }
    
}
