package chapter4;

class AttackPower {
    static final int MIN = 0;
    int value;

    AttackPower(final int value) {
        if (value < MIN) throw new IllegalArgumentException();
        this.value = value;
    }

    /**
     * 攻撃力を強化する
     * @param increment 増分
     */
    void reinforce(int increment) {
        this.value += value;
    }

    /**
     * 無力化する
     */
    void disable() {
        this.value = MIN;
    }
}