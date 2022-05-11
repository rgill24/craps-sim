package craps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Craps {

    Random random;
    Map<CrapsBet, Integer> bets;

    public Craps() {
        random = new Random();
        bets = new HashMap<>();
    }

    public int rollDice() {
        return random.nextInt(1, 7) + random.nextInt(1, 7);
    }

    public void addBet(CrapsBet bet, int amount) {
        if (bets.containsKey(bet)) {
            bets.put(bet, bets.get(bet) + amount);
        } else {
            bets.put(bet, amount);
        }
    }

    public int removeBet(CrapsBet bet) {
        return bets.remove(bet);
    }

}
