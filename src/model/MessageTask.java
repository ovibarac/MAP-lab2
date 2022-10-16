package model;

public class MessageTask extends Task {

    private final String message;
    public MessageTask(String taskID, String descriere, String message) {
        super(taskID, descriere);
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageTask{" +
                ", taskID='" + taskID + '\'' +
                ", descriere='" + descriere + '\'' +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public void execute() {
        System.out.println(this);
    }
}
