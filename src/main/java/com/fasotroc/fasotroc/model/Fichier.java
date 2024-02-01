package com.fasotroc.fasotroc.model;

import com.fasotroc.fasotroc.abstraite.AbstratId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter

@Table(name = "fichier")
public class Fichier extends AbstratId {

    @Column(name = "url_image")
    private String urlImage;

    @ManyToOne
    private Annonce annonce;
}
