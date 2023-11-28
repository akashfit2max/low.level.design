package com.akash.low.level.design.solidprincipals.v0;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bird {
    private int weight;
    private int height;

    private BirdType birdType;

    public void fly() {
        if (this.birdType == BirdType.PEGION) {
            System.out.println("pegion");
        } else if (this.birdType == BirdType.SPARROW) {
            System.out.println("sparrow");
        }
    }
}
