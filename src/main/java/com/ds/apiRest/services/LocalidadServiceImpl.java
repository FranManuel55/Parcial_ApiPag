package com.ds.apiRest.services;

import com.ds.apiRest.entities.Localidad;
import com.ds.apiRest.repositories.BaseRepository;
import com.ds.apiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){
        super(baseRepository);
    }

}
