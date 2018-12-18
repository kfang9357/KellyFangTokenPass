package com.company;

import java.util.Currency;

public class TokenPass {

    private int[] board;
    private int CurrentPlayer;
    private int playerCount;

    public TokenPass(int playerCount, int CurrentPlayer, int[] board)
    {
       this.playerCount = playerCount;
       this.CurrentPlayer = CurrentPlayer;
       this.board = board;
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
        while (beans>0){
        for (int i = 1 ; i<board.length ; i++)
        {
            board[CurrentPlayer+i] ++;
            beans --;
        }
        if (beans>0){
            for (int i = 0 ; i<CurrentPlayer ; i++)
            {
                board[i] ++;
                beans --;
            }
        }
    }

    public int getCurrentPlayer()
    {
        CurrentPlayer = (int) (Math.random() * playerCount);
        return CurrentPlayer;
    }
}
