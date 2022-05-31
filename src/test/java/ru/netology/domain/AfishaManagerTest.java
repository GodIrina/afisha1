package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    Movie first = new Movie(1, "Бладшот", "Боевик");
    Movie second = new Movie(2, "Вперед", "Мультфильм");
    Movie third = new Movie(3, "Отель Белград", "Комедия");
    Movie fourth = new Movie(4, "Джентельмены", "Боевик");
    Movie fifth = new Movie(5, "Человек-невидимка", "Ужасы");
    Movie sixth = new Movie(6, "Тролли. Мировой тур", "Мультфильм");
    Movie seventh = new Movie(7, "Номер Один", "Комедия");
    Movie eighth = new Movie(8, "Наемник", "Боевик");
    Movie ninth = new Movie(9, "Хочу замуж", "Комедия");
    Movie tenth = new Movie(10, "Лулу и Бриггс", "Комедия");
    Movie eleven = new Movie(11, "Парни под прикрытием", "Боевик");



    @Test
    void addFilm() {
        AfishaManager afishaManager = new AfishaManager(0);
        afishaManager.add(first);
        Movie[]expected = new Movie[] {first};
        Movie[]actual = afishaManager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        AfishaManager afishaManager = new AfishaManager(4);
        afishaManager.add(first);
        afishaManager.add(second);
        afishaManager.add(third);
        afishaManager.add(fourth);
        Movie[] expected = new Movie[]{fourth,third,second,first};
        Movie[]actual = afishaManager.findAll();
        assertArrayEquals(expected,actual);


    }
    @Test
    void findAll2() {
        AfishaManager afishaManager = new AfishaManager(1);
        afishaManager.add(first);


        Movie[] expected = new Movie[] { first };
        Movie[] actual = afishaManager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        AfishaManager afishaManager = new AfishaManager(5);
        afishaManager.add(first);
        afishaManager.add(second);
        afishaManager.add(third);
        afishaManager.add(fourth);
        afishaManager.add(fifth);
        afishaManager.add(sixth);
        afishaManager.add(seventh);

        Movie[] expected = new Movie[] {seventh, sixth, fifth, fourth, third };
        Movie[] actual = afishaManager.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindLastThanMoreNumberOfFilm() {
        AfishaManager afishaManager = new AfishaManager();
        afishaManager.add(first);
        afishaManager.add(second);
        afishaManager.add(third);
        afishaManager.add(fourth);
        afishaManager.add(fifth);
        afishaManager.add(sixth);
        afishaManager.add(seventh);
        afishaManager.add(eighth);
        afishaManager.add(ninth);
        afishaManager.add(tenth);
        afishaManager.add(eleven);

        Movie[] expected = new Movie[] {eleven, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second };
        Movie[] actual = afishaManager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastThanLessNumberOfFilm() {
        AfishaManager afishaManager = new AfishaManager(5);
        afishaManager.add(first);
        afishaManager.add(second);
        afishaManager.add(third);

        Movie[] expected = new Movie[] { third, second, first };
        Movie[] actual = afishaManager.findLast();

        assertArrayEquals(expected, actual);
    }
}