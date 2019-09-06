package com.controller;

import com.model.entities.City;
import com.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CityController {

    @Autowired
    ICityService cityService;

    @GetMapping("/showCitiesEnding")
    public String findCitiesNameEndsWith(Model model, @RequestParam String name) {

        List<City> cities = (List<City>) cityService.findByNameEndsWith(name);

        model.addAttribute("cities", cities);

        return "showCities";
    }
}
