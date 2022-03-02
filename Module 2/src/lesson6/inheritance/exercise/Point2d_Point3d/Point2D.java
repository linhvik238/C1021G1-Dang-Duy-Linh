package lesson6.inheritance.exercise.Point2d_Point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void getXY() {
        float[] array = {this.getX(), this.getY()};
    }
    @Override
    public String toString() {
        return "Point2D{ x = " + this.x + ", y = " + this.y + "}";
    }
}
