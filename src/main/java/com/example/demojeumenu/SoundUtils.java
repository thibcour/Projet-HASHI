package com.example.demojeumenu;

import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SoundUtils {

<<<<<<< HEAD
=======
    private static final AtomicBoolean isPlaying = new AtomicBoolean(false);

>>>>>>> parent of 1fbda11 (Théo (#15))
    public static void addHoverSound(Button button) {
        button.setOnMouseEntered(event -> playHoverSound());
    }

    private static void playHoverSound() {
        Media sound = new Media(SoundUtils.class.getResource("sounds/hover.mp3").toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}