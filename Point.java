public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {

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

    @java.lang.Override
    public java.lang.String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public  float[] getXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }
    public  void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
