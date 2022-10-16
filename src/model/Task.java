package model;

import java.util.Objects;

public abstract class Task {
    public String taskID;
    public String descriere;

    public Task() {
        taskID="";
        descriere="";
    }

    public Task(String taskID, String descriere) {
        this.taskID = taskID;
        this.descriere = descriere;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String toString() {
        return "model.Task{" +
                "taskID='" + taskID + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return getTaskID().equals(task.getTaskID()) && getDescriere().equals(task.getDescriere());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaskID(), getDescriere());
    }

    public abstract void execute();
}
