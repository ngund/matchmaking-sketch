package com.ngund.matchmaking.chess;

import com.ngund.matchmaking.model.Game;
import com.ngund.matchmaking.model.Match;
import com.ngund.matchmaking.model.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author n.gundobin
 * @since 20.04.2015
 */
public class ChessGame implements Game {

    private final List<Player> players = new ArrayList<Player>();

    private final List<Match> matches = new ArrayList<Match>();

    @Override
    public Player registerPlayer(String name, int rank) {
        Player p = new ChessPlayer(name, rank, this);
        players.add(p);
        return p;
    }

    @Override
    public List<Match> getMatchHistory() {
        return Collections.unmodifiableList(matches);
    }

    @Override
    public Collection<Player> getAllPlayers() {
        return Collections.unmodifiableList(players);
    }
}
