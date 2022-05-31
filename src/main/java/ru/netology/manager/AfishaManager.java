package ru.netology.manager;


import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor

public class AfishaManager {

    private Movie[] movies = new Movie[0];
    private int numberFilm = 10;


    public AfishaManager(int numberFilm) {
        this.numberFilm = numberFilm;
    }

    public void add(Movie object) {

        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = object;
        movies = tmp;
    }

    public Movie[] findAll() {
        Movie[] result = new Movie[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Movie[] findLast() {
        int resultLength;
        if (movies.length > numberFilm) {
            resultLength = numberFilm;
        } else {
            resultLength = movies.length;
        }

        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }

}
