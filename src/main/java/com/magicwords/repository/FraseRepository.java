package com.magicwords.repository;

import com.magicwords.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {

}
