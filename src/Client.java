import java.util.*;
public class Client {
    String name;
    int scores;

    public void winscores(){
        scores++;
    }

    public static String greetings(int num){ //the part of welcoming new user
        String str="Hello user! "+num+"! Please enter the name:";
        return str;
    }
}