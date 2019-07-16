package pl.samouczekprogramisty.kursjava;

import pl.samouczekprogramisty.kursjava.engine.Cogwheel;

public class Engine {
    private boolean started;
    private Cogwheel cogwheel;

    public void start(){
        started=initiateStartingSequence();
    }

    private boolean initiateStartingSequence() {
        return true;
    }

    public Engine(Cogwheel cogW) {
        cogwheel = cogW;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
