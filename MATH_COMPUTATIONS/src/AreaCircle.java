public class AreaCircle {
    double rad;
        public  AreaCircle (double rad) {
           this.rad = rad;
    }

    public void setRadius(double rad) {
            this.rad=rad;
    }

    public double Area(){
           return (3.142*rad*rad);
    }
}
