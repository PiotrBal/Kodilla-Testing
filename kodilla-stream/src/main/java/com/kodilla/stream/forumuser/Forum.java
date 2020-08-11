package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "User1", 'M', 2000, 10, 5, 5 ));
        forumUsersList.add(new ForumUser(2, "User2", 'M', 2003, 1, 12, 0 ));
        forumUsersList.add(new ForumUser(3, "User3", 'F', 1993, 3, 22, 2 ));
        forumUsersList.add(new ForumUser(4, "User4", 'F', 1974, 10, 14, 0 ));
        forumUsersList.add(new ForumUser(5, "User5", 'M', 2002, 8, 1, 22 ));
        forumUsersList.add(new ForumUser(6, "User6", 'F', 1955, 12, 29, 8 ));
        forumUsersList.add(new ForumUser(7, "User7", 'M', 1984, 9, 11, 1 ));
        forumUsersList.add(new ForumUser(8, "User8", 'M', 2005, 4, 19, 0 ));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }
}
