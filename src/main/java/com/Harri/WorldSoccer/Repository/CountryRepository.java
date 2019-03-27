package com.Harri.WorldSoccer.Repository;

import com.Harri.WorldSoccer.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByName(String name);
}
