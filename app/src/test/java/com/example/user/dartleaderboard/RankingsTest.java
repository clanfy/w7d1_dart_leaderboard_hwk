package com.example.user.dartleaderboard;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 07/11/2016.
 */

public class RankingsTest {

    Rankings mRankings;

    @Test
    public void getRankingsTest(){
        Rankings rankings = new Rankings();
        assertNotNull(rankings.getRankings());
    }

}
