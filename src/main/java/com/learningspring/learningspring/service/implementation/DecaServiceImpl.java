package com.learningspring.learningspring.service.implementation;

import com.learningspring.learningspring.model.Decagon;
import com.learningspring.learningspring.repository.DecaRepo;
import com.learningspring.learningspring.service.DecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DecaServiceImpl implements DecaService {

    @Autowired
    private DecaRepo decaRepo;

    @Override
    public String saveDecagonPerson(Decagon decagon) {

        decaRepo.save(decagon);
        return "saved";
    }
}
