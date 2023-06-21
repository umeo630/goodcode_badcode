class GiftPoint {
    private static final int MIN_POINT = 0;
    private static final int STANDARD_MEMBER_SHIP_POINT = 100;
    private static final int PREMIUM_MEMBER_SHIP_POINT = 300;
    final int value;

    // 外部からはインスタンス生成できない
    // クラス内部でのみインスタンス生成できる
    private GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("ポイントが0以上ではありません。");
        }
        value = point;
    }

    /**
     * @return 標準会員向け入会ギフトポイント
     */
    static GiftPoint forStandardMemberShip() {
        return new GiftPoint(STANDARD_MEMBER_SHIP_POINT);
    }

    /**
     * @return プレミアム会員向け入会ギフトポイント
     */
    static GiftPoint forPremiumMemberShip() {
        return new GiftPoint(PREMIUM_MEMBER_SHIP_POINT);
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
