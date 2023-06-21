class GiftPoint {
    private static final int MIN_POINT = 0;
    final int value;

    GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("ポイントが0以上ではありません。");
        }
        value = point;
    }

    /**
     * ポイントを加算する。
     */
    GiftPoint add(final GiftPoint point) {
        return new GiftPoint(value + point.value);
    }

    /**
     * @return 残余ポイントが消費ポイント以上であればtrue
     */
    boolean isEnough(final ConsumptionPoint point) {
        return point.value <= value;
    }

    /**
     * ポイントを消費する。
     *
     */
    GiftPoint consume(final ConsumptionPoint point) {
        if (!isEnough(point)) {
            throw new IllegalArgumentException("ポイントが不足しています。");
        }
        return new GiftPoint(value - point.value);
    }
}
