package com.example.user.dartleaderboard;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    protected int ranking;

    public Player(String name, String nickname, int ranking){
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName(){
        return this.name;
    }

    public String getNickname(){
        return this.nickname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int getRanking(){
        return this.ranking;
    }

    public void setRanking(int rank){
        this.ranking = rank;
    }

    @Override
    public String toString(){
        return "Player: " + name + ", Nickname: " + nickname + ", Ranking: " + ranking;
    }

}
