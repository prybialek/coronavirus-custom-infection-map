package pl.rybialek.coronavirusmap.data;

public class Point {

    private final double x;
    private final double y;
    private final String text;

    public Point(final double x, final double y, final String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getText() {
        return text;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", text='" + text + '\'' +
                '}';
    }
}
