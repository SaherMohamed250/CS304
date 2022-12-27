import java.util.Scanner;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import javax.sound.sampled.*;

public class Sound {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("file_example_WAV_2MG.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        clip.loop(10000);
        String response = scanner.next();

    }

}
