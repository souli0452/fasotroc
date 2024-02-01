package com.fasotroc.fasotroc.model;

import com.fasotroc.fasotroc.abstraite.AbstratId;
import com.fasotroc.fasotroc.enumeration.TypeMessageEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter
@Table(name = "message")
public class Message extends AbstratId {

    @Column(name = "corsps_message")
    private String corspsMessage;

    @Column(name = "type_message")
    private TypeMessageEnum typeMessageEnum;

    @Column(name = "date_message")
    private LocalDate dateMessage;

    @Column(name = "heure_message")
    private LocalTime heureMessage;

    @Column(name = "id_recepteur_message")
    private String iDrecepteurMessage;

    @Column(name = "id_envoyeur_message")
    private String iDenvoyeurMessage;

    @ManyToOne
    private User user;


}
