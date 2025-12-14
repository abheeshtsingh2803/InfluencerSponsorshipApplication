package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Offer {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Influencer influencer;

    @ManyToOne
    private Brand brand;

    private double moneyAmount;
    private boolean accepted = false;
}
