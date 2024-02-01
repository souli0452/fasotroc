package com.fasotroc.fasotroc.repository;

import com.fasotroc.fasotroc.model.TypeAnnonce;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TypeAnnonceRepository extends JpaRepository<TypeAnnonce, UUID> {
}
