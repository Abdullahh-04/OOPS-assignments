class RationalNumber {

    private int numerator;
    private int denominator;

    RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    RationalNumber(RationalNumber r) {
        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }

    public RationalNumber add(RationalNumber r) {
        RationalNumber temp = new RationalNumber();

        temp.numerator = (this.numerator * r.denominator)
                       + (r.numerator * this.denominator);
        temp.denominator = this.denominator * r.denominator;

        return temp;
    }

    public RationalNumber add(RationalNumber r1, RationalNumber r2) {
        RationalNumber temp = new RationalNumber();

        temp.numerator = this.numerator * r1.denominator * r2.denominator
                + r1.numerator * this.denominator * r2.denominator
                + r2.numerator * this.denominator * r1.denominator;

        temp.denominator = this.denominator * r1.denominator * r2.denominator;

        return temp;
    }

    public RationalNumber subtract(RationalNumber r) {
        RationalNumber temp = new RationalNumber();

        temp.numerator = (this.numerator * r.denominator)
                       - (r.numerator * this.denominator);
        temp.denominator = this.denominator * r.denominator;

        return temp;
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}