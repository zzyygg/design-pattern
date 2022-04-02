package com.guoxj.designPattern.behavioral.command;

/**
 * @author Guoxj
 * @version 1.0
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
