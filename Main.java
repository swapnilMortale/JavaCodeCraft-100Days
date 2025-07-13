package Day_three;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🧠 Tell me how you're feeling today:");
        String input = sc.nextLine();

        UserMood mood = new UserMood(input);

        MoodAnalyzer analyzer = new SimpleMoodAnalyzer();
        String detectedMood = analyzer.analyzeMood(mood.getInputText());
        mood.setDetectedMood(detectedMood);

        System.out.println("\n🎯 Detected Mood: " + detectedMood);
        System.out.println(SongRecommender.getSongForMood(detectedMood));
        System.out.println(SongRecommender.getTipForMood(detectedMood));
        sc.close();
    }
}
