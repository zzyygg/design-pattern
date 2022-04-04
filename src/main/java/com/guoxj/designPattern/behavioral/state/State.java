package com.guoxj.designPattern.behavioral.state;

/**
 * @author Guoxj
 * @version 1.0
 */
public abstract class State {

    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract void handle();
}
