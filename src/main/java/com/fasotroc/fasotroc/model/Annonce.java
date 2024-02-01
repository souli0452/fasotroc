package com.fasotroc.fasotroc.model;

import com.fasotroc.fasotroc.abstraite.AbstratId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter

@Table(name = "annonce")
public class Annonce extends AbstratId {

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "prix", nullable = false)
    private float prix;

    @Column(name = "pays", nullable = false)
    private  String pays;

    @Column(name = "ville", nullable = false)
    private String ville;

    @Column(name = "quartier", nullable = false)
    private String quartier;

    @Column(name = "date_publication_annonce")
    private LocalDate datePublicationAnnonce;

    @Column(name = "heure_publication_annonce")
    private LocalTime heurePublicationAnnonce;

    @OneToMany
    private List<Fichier> fichiers;

    @ManyToOne
    private Categorie categorie;

    @OneToOne
    private User user;

    @ManyToOne
    private TypeAnnonce typeAnnonce;


}
