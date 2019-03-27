package com.Harri.WorldSoccer.Controller;


import com.Harri.WorldSoccer.Model.Country;
import com.Harri.WorldSoccer.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping
    public List<Country> ContinentByCountryByName(@RequestParam(required = false, name = "name") String name,
                                                  @RequestParam(required = false, name = "code") String code,
                                                  @RequestParam(required = false, name = "page") Integer page) {
        return countryService.findByCountry(name, code, page);
    }

}
