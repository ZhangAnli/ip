public abstract class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Overloaded constructor method.
     * @param description String to describe task.
     */
    protected Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Overloaded constructor method.
     * @param description String to describe task.
     * @param isDone Boolean for the done status for task.
     */
    protected Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    /**
     * Status icon for the task based on whether it is done or not.
     * @return String output.
     */
    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }


    /**
     * To mark the task as done.
     */
    public void markAsDone(){
        this.isDone = true;
    }

    /**
     * Getter for checking if Task is done.
     * @return boolean for whether the task is done.
     */
    public boolean getIsDone(){
        return this.isDone;
    }

    /**
     * Getter for the task description.
     * @return string for task description.
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Overrides toString method.
     * @return Prints out task description.
     */
    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "]" + this.description;
    }
}
