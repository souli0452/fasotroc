package com.fasotroc.fasotroc.repository;

import com.fasotroc.fasotroc.model.Fichier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FichierRepository extends JpaRepository<Fichier, UUID> {
}
