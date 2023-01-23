package com.learningspring.learningspring.service;

import com.learningspring.learningspring.model.Decagon;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DecaServiceTest {


    @Autowired
    private DecaService decaService;


    @Test
    public void testDecaSave() {
        Decagon decagon = new Decagon(2L, "Binde", "odo@gmail.com");

        String expected = decaService.saveDecagonPerson(decagon);

        assertTrue(expected.equals("saved"));
    }

}