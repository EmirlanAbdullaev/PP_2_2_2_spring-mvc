package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarServisImpl;

@Controller
public class CarsController {
    private final CarServisImpl carServis;

    public CarsController(CarServisImpl carServis) {
        this.carServis = carServis;
    }

    @GetMapping(value = "/cars")
    public String getListCar(@RequestParam(defaultValue = "5") int count , ModelMap model) {
        model.addAttribute("cars",carServis.index(count));
        return "cars";
    }
}
