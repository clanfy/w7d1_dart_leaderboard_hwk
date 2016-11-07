package com.example.user.dartleaderboard;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {


        Player player1;

        @Before
        public void before(){
            player1 = new Player("Martin Lanfear", "No Fear Lanfear");
        }

        @Test
        public void testPlayerSetUp(){
            assertEquals("Martin Lanfear", player1.getName());
            assertEquals("No Fear Lanfear", player1.getNickname());
        }

    }


