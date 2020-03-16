package pl.rybialek.coronavirusmap.data;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DataRepo {

    private List<Point> points;

    public DataRepo() {
        this.points = new ArrayList<>();
    }

    public List<Point> getPoints() {
        return points;
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }
}
