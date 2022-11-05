package ru.netology;

public class Poster {
    private String[] movies = new String[0];
    private int limit;

    public Poster() {
        this.limit = 3;
    }

    public Poster(int limit) {

        this.limit = limit;
    }

    public void addMovies(String newMovie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;

    }

    public String[] findAllMovies() {
        return movies;
    }

    public String[] findLastMovies() {
        int countMovies;
        if (limit <= movies.length) {
            countMovies = limit;
        } else {
            countMovies = movies.length;
        }

        String[] tmp = new String[countMovies];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
