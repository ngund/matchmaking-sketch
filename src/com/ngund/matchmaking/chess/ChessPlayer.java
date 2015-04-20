package com.ngund.matchmaking.chess;

import com.ngund.matchmaking.model.Game;
import com.ngund.matchmaking.model.Match;
import com.ngund.matchmaking.model.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author n.gundobin
 * @since 20.04.2015
 */
public class ChessPlayer implements Player {

    private final String name;

    private final int rank;

    private final Game game;

    private final List<Match> matches;

    public ChessPlayer(String name, int rank, Game game) {
        this.name = name;
        this.rank = rank;
        this.game = game;
        matches = new ArrayList<Match>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRank() {
        return rank;
    }

    @Override
    public void askForMatch() {

    }

    @Override
    public Game getGame() {
        return game;
    }

    @Override
    public Collection<Match> getMatches() {
        return matches;
    }
}
