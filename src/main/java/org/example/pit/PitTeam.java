package org.example.pit;

public class PitTeam extends Thread {

    private int id;
    private Pit pitStop;

    public PitTeam(int id, Pit pitStop) {
        this.id = id;
        this.pitStop = pitStop;
    }

    @Override
    public void run() {
        //TODO
    }

    public int getPitStoppedCars() {
        //TODO
        return 0;
    }
}
