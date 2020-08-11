package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private char gender = 'M'/'F';
    private final LocalDate birthday;
    private final int postsNumber;

    public ForumUser(int userID, String userName, char gender, int yearOfBirth, int monthOfBirth,
                     int dayOfBirth , int postsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.birthday = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
