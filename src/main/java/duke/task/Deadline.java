package duke.task;

import java.time.LocalDate;
import java.time.format.*;

public class Deadline extends Task {

    protected LocalDate by;

    public Deadline(String description, LocalDate by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " /by " + this.by.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
    }

    public LocalDate getBy() {
        return by;
    }

    public void setBy(LocalDate by) {
        this.by = by;
    }

}
