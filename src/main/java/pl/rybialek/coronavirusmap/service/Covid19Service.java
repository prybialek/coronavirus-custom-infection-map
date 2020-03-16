package pl.rybialek.coronavirusmap.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.rybialek.coronavirusmap.data.DataRepo;
import pl.rybialek.coronavirusmap.data.Point;


@Service
public class Covid19Service {

    private DataRepo dataRepo;

    @Autowired
    public Covid19Service(final DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void getCases() {
        double customLatitude = 51.1275656;
        double customLongitude = 16.9629854;
        String customTextMarker = "Custom coronavirus infection";
        dataRepo.addPoint(new Point(customLatitude, customLongitude, customTextMarker));
    }
}
