public class Wall {

    private double width ;
    private double height ;

    public Wall() {
        this(0,0);

    }
    public Wall(double height, double width) {
        this.height = height;
        this.width = width;


    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(double width, double height) {
        return width * height ;
    };
}
