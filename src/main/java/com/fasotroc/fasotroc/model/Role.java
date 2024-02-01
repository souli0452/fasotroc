package com.fasotroc.fasotroc.model;

import com.fasotroc.fasotroc.abstraite.AbstratId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity

@NoArgsConstructor @AllArgsConstructor @Setter @Getter
@Table(name = "role")
public class Role extends AbstratId {

    @Column(name = "libelle_role")
    private String libelleRole;

}
