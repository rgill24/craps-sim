package craps;

public enum CrapsBet {
    PASS(1),
    PLACE_4(2),
    PLACE_5(1.5),
    PLACE_6(1.2),
    PLACE_8(1.2),
    PLACE_9(1.5),
    PLACE_10(2);

    private final double payout;
    private final int maxBet;

    CrapsBet(double payout) {
        this(payout, 100);
    }

    CrapsBet(double payout, int maxBet) {
        this.payout = payout;
        this.maxBet = maxBet;
    }

    public double getPayout() {
        return payout;
    }
}
