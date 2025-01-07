package org.example;

import org.example.pit.Pit;

import java.util.List;

public class RaceTrack implements Track {

    private int pitTeamsCount;

    public RaceTrack(int pitTeamsCount) {
        this.pitTeamsCount = pitTeamsCount;
    }

    @Override
    public void enterPit(Car car) {

    }

    @Override
    public int getNumberOfFinishedCars() {
        return 0;
    }

    @Override
    public List<Integer> getFinishedCarsIds() {
        return List.of();
    }

    @Override
    public Pit getPit() {
        return null;
    }
}
