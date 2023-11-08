public class AreaTriangle {
    double base;
    double height;

    public AreaTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Area() {
        return (0.5 * base * height);
    }
}

