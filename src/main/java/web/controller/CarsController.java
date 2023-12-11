package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarServiseImpl;

@Controller
public class CarsController {
    private final CarServiseImpl carServis;

    public CarsController(CarServiseImpl carServis) {
        this.carServis = carServis;
    }

    @GetMapping(value = "/cars")
    public String getListCar(@RequestParam(defaultValue = "5") int count , ModelMap model) {
        model.addAttribute("cars",carServis.getCars(count));
        return "cars";
    }
}
