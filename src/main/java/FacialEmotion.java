import org.json.simple.JSONObject;

import java.util.Arrays;

public class FacialEmotion {

    public Eyebrow eyebrows;
    public Mouth mouth;

    public FacialEmotion(Eyebrow eyebrows, Mouth mouth) {
        this.eyebrows = eyebrows;
        this.mouth = mouth;
    }


    public Eyebrow getEyebrows() {
        return eyebrows;
    }

    public void setEyebrows(Eyebrow eyebrows) {
        this.eyebrows = eyebrows;
    }

    public Mouth getMouth() {
        return mouth;
    }

    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }
}
