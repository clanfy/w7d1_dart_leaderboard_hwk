package com.example.user.dartleaderboard;
import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

//public class Ranking implements Rankable{

public class Rankings {


    protected ArrayList<Player> mRankings;

    public Rankings(){
        mRankings = new ArrayList<Player>();
        setUpRankings();
    }

    public Rankings(ArrayList<Player> existingPlayers){
        mRankings = new ArrayList<Player>(existingPlayers);
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