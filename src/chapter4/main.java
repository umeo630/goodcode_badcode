package chapter4;

class main {
    public static void main(String[] args) {
        final AttackPower attackPowerA = new AttackPower(20);
        final AttackPower attackPowerB = new AttackPower(20);

        final Weapon weaponA = new Weapon(attackPowerA);
        final Weapon weaponB = new Weapon(attackPowerB);

        final AttackPower increment = new AttackPower(5);
        final Weapon reinforcedWeaponA = weaponA.reinforce(increment);

        System.out.println("weaponA.attackPower.value: " + weaponA.attackPower.value);
        System.out.println("reinforcedWeaponA.attackPower.value: " + reinforcedWeaponA.attackPower.value);
        System.out.println("weaponB.attackPower.value: " + weaponB.attackPower.value);
    }
}
