package com.Harri.WorldSoccer.Controller;


import com.Harri.WorldSoccer.Model.Country;
import com.Harri.WorldSoccer.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public Page<Country> getCountries(@RequestParam(required = false, name = "page") Integer page) {
        return countryService.findByCountry(page);
    }

    @GetMapping("/country")
    public List<Country> countryByNameOrCode(@RequestParam(required = false, name = "name") String name,
                                             @RequestParam(required = false, name = "code") String code,
                                             @RequestParam(required = false, name = "countries") List<String> countriesToFind) {
        return countryService.findByCountryNameCode(name, code, countriesToFind);
    }

}
