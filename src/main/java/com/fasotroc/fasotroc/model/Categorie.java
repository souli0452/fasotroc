package com.fasotroc.fasotroc.model;

import com.fasotroc.fasotroc.abstraite.AbstratId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter

@Table(name = "categorie")
public class Categorie extends AbstratId {

    @Column(name = "libelle_categorie")
    private String libelleCategorie;

    @OneToMany
    private List<Annonce> annonces;
}
