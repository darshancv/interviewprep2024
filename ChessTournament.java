package check;

import java.util.*;

public class ChessTournament {
    
    public static int findWinningPlayer(int[] potentials, int k) {
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < potentials.length; i++) {
            queue.offer(i); // Add player index to the queue
        }

        int consecutiveWins = 0;
        int winner = -1;
        
        while (consecutiveWins < k) {
            int player1 = queue.poll(); // Get the first player from the queue
            int player2 = queue.poll(); // Get the second player from the queue
            
            if (potentials[player1] > potentials[player2]) {
                queue.offerFirst(player1); // Player 1 wins, goes to the front of the queue
                queue.offerLast(player2);  // Player 2 loses, goes to the end of the queue
                if (winner != player1) {
                    winner = player1;
                    consecutiveWins = 1;
                } else {
                    consecutiveWins++;
                }
            } else {
                queue.offerFirst(player2); // Player 2 wins, goes to the front of the queue
                queue.offerLast(player1);  // Player 1 loses, goes to the end of the queue
                if (winner != player2) {
                    winner = player2;
                    consecutiveWins = 1;
                } else {
                    consecutiveWins++;
                }
            }
        }
        
        return potentials[winner];
    }
    
    public static void main(String[] args) {
        int[] potentials = {3, 2, 1, 4};
        int k = 2;
        int winningPotential = findWinningPlayer(potentials, k);
        System.out.println("The potential of the winning player is: " + winningPotential);
    }
}