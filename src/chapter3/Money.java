package chapter3;

public class Money {
    int amount;
    Currency currency;

    Money(int amount, Currency currency) {
        // ガード節で不正値の混入を防ぐ
        if (amount < 0) throw new IllegalArgumentException("amount must be positive");
        if (currency == null) throw new IllegalArgumentException("currency must be specified");
        this.amount = amount;
        this.currency = currency;
    }
}
