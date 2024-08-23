package com.roboter;
import java.util.ArrayList;
import java.util.List;

public class Roboter{

private boolean awake;
private List<String> activeWork = new ArrayList<>();
private String currentTask;

public Roboter(){
    this.awake = false;
}

public String isItActive(boolean isAwake){
    this.awake = isAwake;
    if (awake) {
        return "Hello, My Name is IRoboter. How can i help you today?";
    } else
        return "Shutting down.";
}


public String getTask(String task){
    if (task == null || task.isEmpty()) {
        return "No task provided.";
    }
    if (!awake) {
        return "Robot is not awake and cannot perform the task.";
    }
    if (task.equals("Invalid task index")) {
        return "Invalid task index, please give an actual task index.";
    }
    this.currentTask = task;
    this.activeWork.add(task);

    return "Understood, i now start to do the task: " + task;
}
public String toString() {
    if (!awake) {
        return "Robot is not awake and cannot perform the task.";
    }
    if (currentTask == null || currentTask.isEmpty()) {
        return "No task is currently being executed.";
    } else {
        return "Roboter is currently performing: " + currentTask;
    }
}}