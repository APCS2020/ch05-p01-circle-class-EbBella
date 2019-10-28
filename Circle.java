public class Circle{
    private double radius;
    private String color;

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}