package BrokenAuditApp;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class BrokenAuditApp {

    static String outputFile = "stage0_output.txt";
    static String teamName = "AuthTeam";
    static Object[][] attempts = {
            {"user-100", true},
            {"user-200", false},
            {"user-300", false},
            {"user-999", true}
    };

    public static void updateOutputFile() throws IOException {
        System.out.println("Working directory output path: " + Path.of(outputFile).toAbsolutePath());
        try (FileWriter f = new FileWriter(outputFile, true)) {
            f.write("EVENTS FOR SYSTEM " + teamName + "\n");
            for (Object[] a : attempts) {
                f.write(generateLogLine((String) a[0], (boolean) a[1]));
            }
            System.out.println("Output file created: " + outputFile);
        }
    }

    private static String generateLogLine(String userId, boolean success) {
        String outcome = success ? "OK" : "NOT_OK";
        String userStatus = "KNOWN";
        if ("user-999".equals(userId)) {
            userStatus = "UNKNOWN";
        }
        return String.format("Date:%s User:%s Type:%s Result:%s\n",
                LocalDateTime.now(), userId, userStatus, outcome);
    }

    public static void main(String[] args) throws IOException {
        updateOutputFile();
    }
}



//    List of improvements needed:
//
//
//
//
//            1. Overwriting file.
//            2. timestamp:
//            - should be per event, not a single timestamp for all events.
//            - Formatting with z +00.00.
//            3. Events should be newline separated in the output file.
//4. deal with user 999 - unknown/known flag.
//
//            try with resources for file handling
//    naming conventions(through out the code)
//    remove unnecessary cli stuff
//    Remove unused code/clean up.
//    fix up the for loop.
//-- break up into more methods.
