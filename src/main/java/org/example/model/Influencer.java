package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Influencer {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String socialMediaPlatform;
    private int followers;
    private double engagementRate;

    private double totalEarnings = 0.0;
}
