package com.kodilla.testing.forum.statistics;

public class StatisticsCount {
    int usersNumber;
    int postsNumber;
    int commentsNumber;
    int avaragePostPerUser;
    int avarageCommentPerUser;
    int avarageCommentPerPost;

    public StatisticsCount(){}

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public int getAvaragePostPerUser() {
        return avaragePostPerUser;
    }

    public int getAvarageCommentPerUser() {
        return avarageCommentPerUser;
    }

    public int getAvarageCommentPerPost() {
        return avarageCommentPerPost;
    }

    void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        avaragePostPerUser = postsNumber / usersNumber;
        avarageCommentPerUser = commentsNumber / usersNumber;
        avarageCommentPerPost = commentsNumber / postsNumber;
    }

    void showStatistics() {
        System.out.println(usersNumber + postsNumber + commentsNumber +
                avaragePostPerUser + avarageCommentPerUser + avarageCommentPerPost);
    }
}
