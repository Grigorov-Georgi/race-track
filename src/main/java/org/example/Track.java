package org.example;

import org.example.pit.Pit;

import java.util.List;

public interface Track {

    void enterPit(Car car);

    int getNumberOfFinishedCars();

    List<Integer> getFinishedCarsIds();

    Pit getPit();
}
