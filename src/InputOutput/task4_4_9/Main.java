package InputOutput.task4_4_9;

import java.util.Optional;

public class Main {


    public static void main(String[] args) {

        String from = "mail1";
        String to = "mail2";
        String message = "hello";

        System.out.println("Detected target mail correspondence: from " + from + " to " + to + " \"" + message + "\"");
        System.out.println(String.format("Detected target mail correspondence: from %s to %s \"%s\"",from,to, message));

    }

}


