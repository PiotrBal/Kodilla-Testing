package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getBirthday().getYear() <= 2000)
                .filter(forumUser -> forumUser.getPostsNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
        System.out.println(resultOfForumUsers.size());
        System.out.println(resultOfForumUsers);

        resultOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
