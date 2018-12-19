package com.company;

import java.util.Currency;

public class TokenPass {

    private int[] board;
    private int CurrentPlayer;
    private int playerCount;

    public TokenPass(int playerCount)
    {
       this.playerCount = playerCount;
       this.CurrentPlayer = (int) (Math.random() * playerCount);
    }

    public int[] getBoard()
    {
        board = new int [playerCount];
        for(int i = 0; i < board.length; i++) {
            board[i] = (int) (Math.random() * 10 + 1);
        }
        return board;
    }

    public void distributeCurrentPlayerTokens()
    {
        int beans = board[CurrentPlayer];
        board[CurrentPlayer] = 0;
        int i = CurrentPlayer + 1;

        while(beans > 0)
        {
            if(i == board.length)
                i = 0;

            board[i]++;
            beans--;
            i++;
        }
    }

    public int getCurrentPlayer() {
        return CurrentPlayer;
    }
}
