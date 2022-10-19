package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void testAdd() {
        Poster manager = new Poster();
        manager.addMovies("movies1");

        String[] expected = {"movies1"};
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMiddle() {
        Poster manager = new Poster();
        manager.addMovies("movies1");
        manager.addMovies("movies2");
        manager.addMovies("movies3");
        manager.addMovies("movies4");
        manager.addMovies("movies5");
        manager.addMovies("movies6");

        String[] expected = {"movies6", "movies5", "movies4"};
        String[] actual = manager.findLastMovies(3);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMore() {
        Poster manager = new Poster();
        manager.addMovies("movies1");
        manager.addMovies("movies2");
        manager.addMovies("movies3");
        manager.addMovies("movies4");
        manager.addMovies("movies5");
        manager.addMovies("movies6");

        String[] expected = {"movies6", "movies5", "movies4", "movies3", "movies2", "movies1"};
        String[] actual = manager.findLastMovies(10);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMoviesTest() {
        Poster manager = new Poster();
        manager.addMovies("movies1");
        manager.addMovies("movies2");
        manager.addMovies("movies3");
        manager.addMovies("movies4");
        manager.addMovies("movies5");

        String[] expected = {"movies1", "movies2", "movies3", "movies4", "movies5"};
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

}
