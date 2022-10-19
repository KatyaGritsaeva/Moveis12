package ru.netology;

public class Poster {
    private String[] movies = new String[0];
    private int limit;

    public Poster(){
        this.limit = 3;
    }

    public Poster(int limit){
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

    public String[] findLastMovies(int limit) {
        int countMovies;
        if (limit <= movies.length){
            countMovies = limit;
        }
        else {
            limit = movies.length;
        }

        String[] tmp = new String[limit];
        for (int i = 0; i < limit; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        //movies = tmp;
        return tmp;
    }
}
