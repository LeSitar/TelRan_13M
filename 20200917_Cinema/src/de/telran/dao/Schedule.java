package de.telran.dao;

import de.telran.data.Cinema;
import de.telran.data.Film;

public class Schedule {
    private Film[] films;
    private int size;

    public Schedule (int capacity){
        films = new Film[capacity];
        size = 0;
    }

    public boolean addFilm(Film film){
        if(size<films.length){
            films[size] = film;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteFilm(Film film){
        for (int i = 0; i <size ; i++) {
            if(films[i].equals(film)){
                films[i] = films[size-1];
                size--;
                return true;
            }
        }
        return false;
    }


    public void displayFilms(){
        for (int i = 0; i <size ; i++) {
            System.out.println(films[i]);
        }
    }

    public void displayFilmsByCinema(String cinema){
        System.out.println("In cinema " + cinema + " you can watch: ");
        boolean flag = false;
        for (int i = 0; i <size ; i++) {
            if (Cinema.isCinemaInArray(cinema, films[i].getCinemas())) {
                System.out.println(films[i].getTitle()+", " + films[i].getGenre() + "\n" + films[i].getDate());
                System.out.println("------------------------------------");
                flag = true;
            }
        }
        System.out.println(flag ? "":"no information");  // if (!flag){System.out.println("no information")};

    }
}
