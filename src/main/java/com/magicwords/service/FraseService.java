package com.magicwords.service;

import com.magicwords.dto.FraseDTO;
import com.magicwords.model.Frase;
import com.magicwords.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;
    public FraseDTO  obterFraseAleatoria(){
        Frase frase = repositorio.findById(4L).get();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
