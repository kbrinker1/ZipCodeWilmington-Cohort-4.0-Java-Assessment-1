package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove= "";
       if (handSign == "rock"){
           winningMove = "paper";
       }
       else if (handSign == "paper"){
           winningMove = "scissor";
       }
       else if (handSign == "scissor"){
           winningMove = "rock";
       }
       return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove= "";
        if (handSign == "rock"){
            losingMove = "scissor";
        }
        else if (handSign == "paper"){
            losingMove = "rock";
        }
        else if (handSign == "scissor"){
            losingMove = "paper";
        }
        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if (handSignOfPlayer1 =="rock"){
            if (handSignOfPlayer2 =="scissor"){
              winner = "rock";
            }
            else if (handSignOfPlayer2 == "paper"){
                winner = "paper";
            }
            else if (handSignOfPlayer2 == "rock")
                winner = "tie";

        }

        else if (handSignOfPlayer1 =="paper"){
                if (handSignOfPlayer2 =="scissor"){
                    winner = "scissor";
                }
                else if (handSignOfPlayer2 == "paper"){
                    winner = "tie";
                }
                else if (handSignOfPlayer2 == "rock")
                    winner = "paper";

        }
        else if (handSignOfPlayer1 =="scissor"){
            if (handSignOfPlayer2 =="scissor"){
                winner = "tie";
            }
            else if (handSignOfPlayer2 == "paper"){
                winner = "scissor";
            }
            else if (handSignOfPlayer2 == "rock")
                winner = "rock";

        }

        return winner;
    }
}
