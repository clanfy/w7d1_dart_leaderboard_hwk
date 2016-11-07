package com.example.user.dartleaderboard;
import java.util.Arrays;

/**
 * Created by user on 07/11/2016.
 */

//public class Ranking implements Rankable{

    public class Ranking {


        protected Player[] mRankings;

    public Ranking(){
        mRankings = new Player[2];
        setUpRankings();
    }

//    public Ranking(Player[] existingPlayers){
//        mRankings = new Player[2](existingPlayers);
//    }

    private void setUpRankings(){
        Player[] players = {
                new Player("Martin Lanfear", "'No Fear Lanfear'", 1),
                new Player("Cookie Lacson", "'The Cookie Monster'", 2)
        };

        for (Player player : players){
            add(player);
        }
    }

    public Player[] getPlayers(){
        return new Player[](mRankings);
    }

    public void add(Player newPlayer){
        mRankings.add(newPlayer);
    }
}
