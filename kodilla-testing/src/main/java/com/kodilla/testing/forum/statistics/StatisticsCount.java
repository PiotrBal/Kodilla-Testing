package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCount implements Statistics {
    /*  liczbę użytkowników,
        liczbę postów,
        liczbę komentarzy,
        średnią liczbę postów na użytkownika,
        średnią liczbę komentarzy na użytkownika,
        średnią liczbę komentarzy na post.*/
    void calculateAdvStatistics(Statistics statistics) {
        //obliczy podane powyżej wartości
        // i zapamięta je we właściwościach (polach) klasy.
    }
    void showStatistics() {
        //wyświetli zapamiętane we właściwościach statystyki
    }

    @Override
    public List<String> usersNames() {
        return usersNames.size();
    }

    @Override
    public int postsCount() {
        return posts.size();
    }

    @Override
    public int commentsCount() {
        return comments.size();
    }
}
