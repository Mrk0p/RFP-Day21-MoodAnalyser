package com.bridgelabz.mood_analyser;

public class MoodAnalyser {

    String message;
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    public MoodAnalyser()
    {
        super();
    }
    public String analyseMood(String message)
    {
        if(message.contains("sad"))
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }
}
