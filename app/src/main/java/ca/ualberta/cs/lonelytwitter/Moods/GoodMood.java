package ca.ualberta.cs.lonelytwitter.Moods;

import java.util.Date;

public class GoodMood extends AbstractMoodClass {

    protected String mood;

    public GoodMood(String mood, Date currDate) {
        this.mood = mood;
        super.setCurrentDate(currDate);

    }

    public GoodMood(String mood) {
        this.mood = mood;
        super.setCurrentDate(new Date());
    }

    public String sendMood(){
        return "I am currently in a " + this.mood + "! I feel great.";
    }

}
