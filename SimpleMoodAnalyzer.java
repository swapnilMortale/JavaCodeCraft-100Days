package Day_three;
public class SimpleMoodAnalyzer extends MoodAnalyzer {
    @Override
    public String analyzeMood(String text) {
        text = text.toLowerCase();

        if (text.contains("happy") || text.contains("excited") || text.contains("awesome")) {
            return "Happy";
        } else if (text.contains("sad") || text.contains("tired") || text.contains("down") || text.contains("low")) {
            return "Sad";
        } else if (text.contains("angry") || text.contains("frustrated") || text.contains("annoyed")) {
            return "Angry";
        } else if (text.contains("calm") || text.contains("relaxed") || text.contains("peaceful")) {
            return "Calm";
        } else {
            return "Neutral";
        }
    }
}
