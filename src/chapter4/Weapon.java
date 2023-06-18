package chapter4;

class Weapon {
    final AttackPower attackPower;

    Weapon(final AttackPower attackPower) {
        this.attackPower = attackPower;
    }

    Weapon reinforce(final AttackPower increment) {
        final AttackPower reinForced = attackPower.reinforce(increment);
        return new Weapon(reinForced);
    }
}
