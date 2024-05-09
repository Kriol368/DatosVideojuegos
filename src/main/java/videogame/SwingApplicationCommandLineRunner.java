package videogame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import videogame.repository.VideogameRepository;
import videogame.ui.VideogameUI;

import java.awt.*;

/**
 * This CommandLineRunner fires off at runtime and boots up our GUI.
 */
@Component
public class SwingApplicationCommandLineRunner implements CommandLineRunner {

    private final VideogameRepository videogameRepository;
    @Autowired
    public SwingApplicationCommandLineRunner(VideogameRepository videogameRepository){
        this.videogameRepository = videogameRepository;
    }
    @Override
    public void run(String... args) {
        //This boots up the GUI.
        EventQueue.invokeLater(()  ->  new VideogameUI(videogameRepository).setVisible(true));
    }
}
