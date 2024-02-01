package com.fasotroc.fasotroc.repository;

import com.fasotroc.fasotroc.model.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnnonceRepository extends JpaRepository<Annonce, UUID> {
}
