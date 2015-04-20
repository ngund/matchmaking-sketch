package com.ngund.matchmaking.model;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author n.gundobin
 * @since 20.04.2015
 */
public interface Player extends Serializable {

    public String getName();

    public int getRank();

    public void askForMatch();

    public Game getGame();

    public Collection<Match> getMatches();
}
