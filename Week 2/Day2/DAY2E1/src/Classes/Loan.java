package Classes;

import java.util.Date;

public class Loan {
    private int id;
    private Copy copy;
    private User user;
    private Date load_date;

    public Loan(int id, Copy copy, User user, Date load_date, Date due_date) {
        this.id = id;
        this.copy = copy;
        this.user = user;
        this.load_date = load_date;
        this.due_date = due_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getLoad_date() {
        return load_date;
    }

    public void setLoad_date(Date load_date) {
        this.load_date = load_date;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    private Date due_date;
}
