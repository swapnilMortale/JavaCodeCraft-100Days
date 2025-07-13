package Day_three;
public class UserMood {
    private String inputText;
    private String detectedMood;

    public UserMood(String inputText) {
        this.inputText = inputText;
    }

    public String getInputText() {
        return inputText;
    }

    public String getDetectedMood() {
        return detectedMood;
    }

    public void setDetectedMood(String detectedMood) {
        this.detectedMood = detectedMood;
    }
}
