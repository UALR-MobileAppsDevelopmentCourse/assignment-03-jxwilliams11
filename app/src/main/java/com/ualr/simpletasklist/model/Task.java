package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

    String taskDescription;
    boolean taskIsDone;

    // TODO 02. Define the class constructor and the corresponding getters and setters.
    Task(String description, boolean isDone)
    {
        taskDescription = description;
        taskIsDone = isDone;
    }

    public String getTaskDescription()
    {
        return taskDescription;
    }

    public boolean getTaskIsDone()
    {
        return taskIsDone;
    }

    public void setTaskDescription(String newTaskDescription)
    {
        taskDescription = newTaskDescription;
    }

    public void setTaskIsDone()
    {
        taskIsDone = true;
    }
}
