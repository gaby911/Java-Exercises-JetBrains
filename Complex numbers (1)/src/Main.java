class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex number) {
        this.real = this.real + number.real;
        this.image = this.image + number.image;
    }
    public void subtract(Complex number) {
        this.real = this.real - number.real;
        this.image = this.image - number.image;
    }
}