package com.fasotroc.fasotroc.repository;

import com.fasotroc.fasotroc.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategorieRepository extends JpaRepository<Categorie, UUID> {
}
