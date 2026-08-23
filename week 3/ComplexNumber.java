class ComplexNumber {

    private double real;
    private double imaginary;

    ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber(ComplexNumber c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
        ComplexNumber temp = new ComplexNumber();

        temp.real = this.real + c.real;
        temp.imaginary = this.imaginary + c.imaginary;

        return temp;
    }

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber();

        temp.real = this.real + c1.real + c2.real;
        temp.imaginary = this.imaginary + c1.imaginary + c2.imaginary;

        return temp;
    }

    public ComplexNumber subtract(ComplexNumber c) {
        ComplexNumber temp = new ComplexNumber();

        temp.real = this.real - c.real;
        temp.imaginary = this.imaginary - c.imaginary;

        return temp;
    }
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}