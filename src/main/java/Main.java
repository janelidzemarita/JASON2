
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Map;
import com.google.gson.Gson;
public class Main {

    public static void main(String[] args){
        FacialEmotion f = new FacialEmotion(Eyebrow.downward, Mouth.neutral);


    }
    @Test
    public static void task2(){
        FacialEmotion some = new FacialEmotion(Eyebrow.downward, Mouth.neutral);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(some.getMouth(), "smile");
        jsonObject.put(some.getEyebrows(), "frown");
        System.out.println(new Gson().toJson(jsonObject));

    }
    @Test
    public static void task3(){

    }

    @Test
    public static void task4(){

    }
}
