package chapter4;

class HitPoint {
    private static final int MIN = 0;
    int amount;

    HitPoint(final int amount) {
        if (amount < MIN)  throw new IllegalArgumentException();
        this.amount = amount;
    }

    /**
     * ダメージを受ける
     * @param damageAmount
     */
    void damage(final int damageAmount) {
        final int nextAmount = amount - damageAmount;
        amount = Math.max(nextAmount, MIN);
    }

    /*
     * @return ヒットポイントが0であればtrue
     */
    boolean isZero() {
        return amount == MIN;
    }
}
