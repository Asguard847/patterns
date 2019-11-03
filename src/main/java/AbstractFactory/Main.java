package AbstractFactory;

import AbstractFactory.factory.AbstractFactory;
import AbstractFactory.factory.FactoryProducer;
import AbstractFactory.model.LanguageTypes;
import AbstractFactory.model.Movie;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> movieTitles = Arrays.asList("Titanic",
            "Fight club", "Matrix", "Apocalypse now");

    private List<LanguageTypes> languages = Arrays.asList(LanguageTypes.values());

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Available films: " + movieTitles);
            System.out.println("Available languages: " + languages);
            System.out.println("\nEnter 2 values: number of film and number of language");

            int movieNumber = scanner.nextInt();
            int languageNumber = scanner.nextInt();

            if (!validateInput(movieNumber, languageNumber)) {
                throw new InputMismatchException();
            }

            Movie movie = createMovie(movieNumber, languageNumber);

            System.out.println("Your movie is ready!");
            movie.getSoundtrack().playSoundtrack();
            movie.getSubtitles().displaySubtitles();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
        }
    }

    private boolean validateInput(int movieNumber, int languageNumber) {
        return movieNumber > 0 && movieNumber < movieTitles.size() + 1
                && languageNumber > 0 && languageNumber < languages.size() + 1;
    }

    private Movie createMovie(int movieNumber, int languageNumber) {

        AbstractFactory factory = FactoryProducer.getFactory(languages.get(languageNumber - 1));
        Movie movie = new Movie();
        movie.setTitle(movieTitles.get(movieNumber - 1));
        movie.setSoundtrack(factory.getSoundtrack());
        movie.setSubtitles(factory.getSubtitles());

        return movie;
    }
}
