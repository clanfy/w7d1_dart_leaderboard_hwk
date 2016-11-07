package com.example.user.dartleaderboard;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    Ranking mRanking;

    @Test
    public void getPlayersTest(){
        Players players = new Players();
        assertNotNull(players.getPlayers());
    }

}
