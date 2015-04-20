package com.ngund.matchmaking.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author n.gundobin
 * @since 20.04.2015
 */
public interface Game extends Serializable {

    public List<Match> getMatchHistory();

    public Collection<Player> getAllPlayers();
}
