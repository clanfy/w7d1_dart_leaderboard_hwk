package com.example.user.dartleaderboard;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    protected int ranking;

    public Player(String name, String nickname){
        this.name = name;
        this.nickname = nickname;
        this.ranking = 1;
    }

    public String getName(){
        return this.name;
    }

    public String getNickname(){
        return this.nickname;
    }


}
