package com.mytutos.springboottestsuite.space;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {

    @Id
    @Generated
    private Long id;
    private String model;
    private Long fuelLeft;

}
