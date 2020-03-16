package pl.rybialek.coronavirusmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.rybialek.coronavirusmap.data.DataRepo;

@Controller
public class MapController {

    private DataRepo dataRepo;

    @Autowired
    public MapController(final DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getMap(Model model) {
        model.addAttribute("points", dataRepo.getPoints());
        return "map";
    }
}
