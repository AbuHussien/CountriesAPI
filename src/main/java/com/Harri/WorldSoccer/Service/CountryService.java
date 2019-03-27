package com.Harri.WorldSoccer.Service;

import com.Harri.WorldSoccer.Model.Country;
import com.Harri.WorldSoccer.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.ArrayList;
import java.util.List;

public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Page<Country>findByCountry(Integer page) {
        if(page != null)
            return countryRepository.findAll(new PageRequest(page, 10));
        else
            return countryRepository.findAll(new PageRequest(0, 10));
    }

    public List<Country>findByCountryNameCode(String name, String code, List<String> countriesNames) {
        List<Country> countries = new ArrayList<>();
        if (code != null)
            countries.add(countryRepository.findById(code).get());
        else
        if (name != null)
            countries.add(countryRepository.findByName(name));
        else
        if(countriesNames != null)
            return countryRepository.findByNameIn(countriesNames);
        return countries;
    }
}
