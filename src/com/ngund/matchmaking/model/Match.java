package com.ngund.matchmaking.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author n.gundobin
 * @since 20.04.2015
 */
public interface Match extends Serializable {

    public void play();

    public List<Player> getWinners();

    public List<Player> getLosers();

    public void addPlayer(Player p);

    public boolean isReady();
}
