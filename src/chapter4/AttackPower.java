package chapter4;

class AttackPower {
    static final int MIN = 0;
    final int value;

    AttackPower(final int value) {
        if (value < MIN) throw new IllegalArgumentException();
        this.value = value;
    }

    /**
     * 攻撃力を強化する
     *
     * @param increment 増分
     * @return 強化された攻撃力
     */
    AttackPower reinforce(final AttackPower increment) {
        return new AttackPower(this.value + increment.value);
    }

    /**
     * 無力化する
     */
    AttackPower disable() {
        return new AttackPower(MIN);
    }
}