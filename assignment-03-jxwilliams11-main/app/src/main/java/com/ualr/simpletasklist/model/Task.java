package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

    String taskDescription;
    boolean taskDone;

    // TODO 02. Define the class constructor and the corresponding getters and setters.

    Task(String description, boolean isDone)
    {
        taskDescription = description;
        taskDone = isDone;
    }

    public boolean getTaskIsDone()
    {
        return taskDone;
    }

    public String getTaskDescription()
    {
        return taskDescription;
    }

    public void setTaskDescription(String input)
    {
        taskDescription = input;
    }

    public void setTaskIsDone()
    {
        taskDone = true;
    }

}
