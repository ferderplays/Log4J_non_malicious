import java.io.IOException;

public class Uwu {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec(
                    "cmd.exe /c echo Hello, please update JRE, cause i just used RCE at u. Also, u r lucky, that i didn't steal your passwords :D");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}