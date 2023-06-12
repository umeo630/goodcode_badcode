package chapter3;

public class Money {
    final int amount;
    final Currency currency;

    Money(final int amount, final Currency currency) {
        // ガード節で不正値の混入を防ぐ
        if (amount < 0) throw new IllegalArgumentException("amount must be positive");
        if (currency == null) throw new IllegalArgumentException("currency must be specified");
        this.amount = amount;
        this.currency = currency;
    }

    Money add(final Money other) {
        if(!currency.equals(other.currency)) throw new IllegalArgumentException("currencies must be same");
        final int added = amount + other.amount;
        return new Money(added, currency);
    }
}
