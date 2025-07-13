package Day_three;
public class SongRecommender {
    public static String getSongForMood(String mood) {
        switch (mood) {
            case "Happy":
                return "🎵 'Happy' by Pharrell Williams";
            case "Sad":
                return "🎵 'Let It Be' by The Beatles";
            case "Angry":
                return "🎵 'In The End' by Linkin Park";
            case "Calm":
                return "🎵 Lo-Fi Chill Beats playlist";
            default:
                return "🎵 'On Top of the World' by Imagine Dragons";
        }
    }

    public static String getTipForMood(String mood) {
        switch (mood) {
            case "Happy":
                return "✨ Keep the positive energy flowing!";
            case "Sad":
                return "💡 Take a walk, talk to a friend, or listen to soft music.";
            case "Angry":
                return "😌 Take deep breaths. Try journaling or meditation.";
            case "Calm":
                return "🌸 Enjoy the peace. Maybe read or do something creative.";
            default:
                return "🔄 Stay balanced. You're doing great!";
        }
    }
}
