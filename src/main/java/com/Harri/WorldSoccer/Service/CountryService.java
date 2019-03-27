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

    public List<Country>findByCountry(String name, String code, Integer page) {
        List<Country> countries = new ArrayList<>();
        if (code != null)
            countries.add(countryRepository.findById(code).get());
        else
            if (name != null)
                countries.add(countryRepository.findByName(name));
            else
                if(page != null)
                    return countryRepository.findAll(new PageRequest(page, 10)).getContent();
                else
                    return countryRepository.findAll();
        return countries;
    }
}
