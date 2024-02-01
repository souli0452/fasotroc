package com.fasotroc.fasotroc.model;

import com.fasotroc.fasotroc.abstraite.AbstratId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter

@Table(name = "type_annonce")
public class TypeAnnonce extends AbstratId {

    @Column(name = "libelle_type_annonce")
    private String libelleTypeAnnonce;

    @OneToMany
    private List<Annonce> annonces;
}
