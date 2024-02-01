package com.fasotroc.fasotroc.repository;

import com.fasotroc.fasotroc.model.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AbonnementRepository extends JpaRepository<Abonnement, UUID> {
}
