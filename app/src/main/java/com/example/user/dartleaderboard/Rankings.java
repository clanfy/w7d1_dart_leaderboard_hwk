package com.example.user.dartleaderboard;
import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

//public class Ranking implements Rankable{

public class Rankings {


    protected Player[] mRankings;

    public Rankings(){
        this.mRankings = new Player[2];
        setUpRankings();
    }

    public Rankings(Player[] existingPlayers){
        mRankings = new Player[](existingPlayers);
    }

    private void setUpRankings(){
        Player[] players = {
                new Player("Martin Lanfear", "'No Fear Lanfear'", 2),
                new Player("Cookie Lacson", "'The Cookie Monster'", 1)
        };

        for (Player player : players){
            add(player);
        }
    }

    public ArrayList<Player> getRankings(){
        return new ArrayList<Player>(mRankings);
    }

    public void add(Player newPlayer){
        mRankings.add(newPlayer);
    }

}