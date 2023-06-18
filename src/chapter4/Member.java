package chapter4;

public class Member {
    final HitPoint hitPoint;
    final Status status;

    void damage(final int damageAmount) {
        hitPoint.damage(damageAmount);
        if (hitPoint.isZero()) {
            status.add(StateType.dead);
        }
    }
}
