package edu.ucsc.soe.sys;

public class Sequencer {
    private long woffset;
    public synchronized long getToken() {
        return woffset++;
    }
}