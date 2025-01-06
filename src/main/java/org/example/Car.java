package org.example;

public class Car implements Runnable {

    private int id;
    private int nPitStops;
    private Track track;

    public Car(int id, int nPitStops, Track track) {
        this.id = id;
        this.nPitStops = nPitStops;
        this.track = track;
    }

    @Override
    public void run() {
        //TODO
    }

    public int getId() {
        return id;
    }

    public int getnPitStops() {
        return nPitStops;
    }

    public Track getTrack() {
        return track;
    }
}
