package ca.ualberta.cs.lonelytwitter.Moods;

import java.util.Date;

public class BadMood extends AbstractMoodClass {

    protected String mood;

    public BadMood(String mood, Date currDate) {
        this.mood = mood;
        super.setCurrentDate(currDate);

    }

    public BadMood(String mood) {
        this.mood = mood;
        super.setCurrentDate(new Date());
    }

    public String sendMood(){
        return "I am currently in a " + this.mood + "! I feel not so great.";
    }

}
