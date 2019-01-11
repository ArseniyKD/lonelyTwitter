package ca.ualberta.cs.lonelytwitter.Moods;

import java.util.Date;

public abstract class AbstractMoodClass {

    private Date currentDate;

    public AbstractMoodClass(){

    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public abstract String sendMood();

}
