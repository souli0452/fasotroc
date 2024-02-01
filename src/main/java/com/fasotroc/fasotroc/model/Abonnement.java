package com.fasotroc.fasotroc.model;

import com.fasotroc.fasotroc.abstraite.AbstratId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter

@Table(name = "abonnement")
public class Abonnement extends AbstratId {

    @Column(name = "libelle_abonnement")
    private String liblleAbonnement;

    @Column(name = "nombre_annonce")
    private String nombreAnnonce;

    @Column(name = "date_debut")
    private String dateDebut;

    @OneToOne
    private User user;
}
