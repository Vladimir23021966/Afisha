import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {
    ManagerFilms manager = new ManagerFilms(10);

    @Test
    public void testShouldAddFiveFilms() {
        ManagerFilms manager = new ManagerFilms();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] actual = manager.findAll();
        String[] expected = {
                "film1",
                "film2",
                "film3",
                "film4",
                "film5"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldAddZeroFilms() {
        ManagerFilms manager = new ManagerFilms();
        String[] actual = manager.findAll();
        String[] expected = {
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldAddOneFilms() {
        ManagerFilms manager = new ManagerFilms();
        manager.addFilm("film1");


        String[] actual = manager.findAll();
        String[] expected = {
                "film1"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldAddTenFilms() {
        ManagerFilms manager = new ManagerFilms();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");

        String[] actual = manager.findAll();
        String[] expected = {
                "film1",
                "film2",
                "film3",
                "film4",
                "film5",
                "film6",
                "film7",
                "film8",
                "film9",
                "film10"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastTenFilms() {

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");
        String[] actual = manager.findLast();
        String[] expected = {
                "film15",
                "film14",
                "film13",
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastLessFilms() {

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");

        String[] actual = manager.findLast();
        String[] expected = {
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1"

        };
        assertArrayEquals(expected, actual);
    }
}


