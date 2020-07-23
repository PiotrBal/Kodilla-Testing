package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCountTestSuite {
    @Test(expected=java.lang.ArithmeticException.class)
    public void testCalculateAdvStatisticsWhenPosts0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 0;
        List<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("User1");
        usersNamesList.add("User2");
        usersNamesList.add("User3");
        usersNamesList.add("User4");
        usersNamesList.add("User5");
        int commentsNumber = 20;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCount statisticsCountPosts = new StatisticsCount();

        //When
        statisticsCountPosts.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(10, statisticsCountPosts.getPostsNumber());
        Assert.assertEquals(20, statisticsCountPosts.getCommentsNumber());
        Assert.assertEquals(2, statisticsCountPosts.getPostsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(4, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(2, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getPostsNumber());
    }
    @Test
    public void testCalculateAdvStatisticsWhenPosts1000 () {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 1000;
        List<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("User1");
        usersNamesList.add("User2");
        usersNamesList.add("User3");
        usersNamesList.add("User4");
        usersNamesList.add("User5");
        int commentsNumber = 2000;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCount statisticsCountPosts = new StatisticsCount();

        //When
        statisticsCountPosts.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(1000, statisticsCountPosts.getPostsNumber());
        Assert.assertEquals(2000, statisticsCountPosts.getCommentsNumber());
        Assert.assertEquals(200, statisticsCountPosts.getPostsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(400, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(2, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getPostsNumber());
    }
    @Test
    public void testCalculateAdvStatisticsWhenComments0 () {
         //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 10;
        List<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("User1");
        usersNamesList.add("User2");
        usersNamesList.add("User3");
        usersNamesList.add("User4");
        usersNamesList.add("User5");
        int commentsNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCount statisticsCountPosts = new StatisticsCount();

        //When
        statisticsCountPosts.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(10, statisticsCountPosts.getPostsNumber());
        Assert.assertEquals(0,  statisticsCountPosts.getCommentsNumber());
        Assert.assertEquals(2, statisticsCountPosts.getPostsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(0, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(0, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getPostsNumber());
    }
    @Test(expected=java.lang.ArithmeticException.class)
    public void testCalculateAdvStatisticsWhenUsers0 () {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 5;
        List<String> usersNamesList = new ArrayList<>(0);
        int commentsNumber = 10;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCount statisticsCountPosts = new StatisticsCount();

        //When
        statisticsCountPosts.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(5,  statisticsCountPosts.getPostsNumber());
        Assert.assertEquals(10, statisticsCountPosts.getCommentsNumber());
        Assert.assertEquals(0, statisticsCountPosts.getPostsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(0, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(2, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getPostsNumber());
    }
    @Test(expected=java.lang.ArithmeticException.class)
    public void testCalculateAdvStatisticsWhenUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 200;
        List<String> usersNamesList = new ArrayList<>(100);
        int commentsNumber = 10;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCount statisticsCountPosts = new StatisticsCount();

        //When
        statisticsCountPosts.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(200,  statisticsCountPosts.getPostsNumber());
        Assert.assertEquals(5000, statisticsCountPosts.getCommentsNumber());
        Assert.assertEquals(2, statisticsCountPosts.getPostsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(50, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getUsersNumber());
        Assert.assertEquals(25, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getPostsNumber());
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentsLessThanPosts(){
         //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 10;
        List<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("User1");
        usersNamesList.add("User2");
        usersNamesList.add("User3");
        usersNamesList.add("User4");
        usersNamesList.add("User5");
        int commentsNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCount statisticsCountPosts = new StatisticsCount();

        //When
        statisticsCountPosts.calculateAdvStatistics(statisticsMock);

        //Then
        if(statisticsMock.commentsCount() < statisticsMock.postsCount()) {
            Assert.assertEquals(5, statisticsCountPosts.getUsersNumber());
            Assert.assertEquals(10, statisticsCountPosts.getPostsNumber());
            Assert.assertEquals(0,  statisticsCountPosts.getCommentsNumber());
            Assert.assertEquals(2, statisticsCountPosts.getPostsNumber() / statisticsCountPosts.getUsersNumber());
            Assert.assertEquals(0, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getUsersNumber());
            Assert.assertEquals(0, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getPostsNumber());
        }
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 10;
        List<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("User1");
        usersNamesList.add("User2");
        usersNamesList.add("User3");
        usersNamesList.add("User4");
        usersNamesList.add("User5");
        int commentsNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCount statisticsCountPosts = new StatisticsCount();

        //When
        statisticsCountPosts.calculateAdvStatistics(statisticsMock);

        //Then
        if (statisticsMock.commentsCount() > statisticsMock.postsCount()) {
            Assert.assertEquals(5, statisticsCountPosts.getUsersNumber());                                           
            Assert.assertEquals(10, statisticsCountPosts.getPostsNumber());                                          
            Assert.assertEquals(0,  statisticsCountPosts.getCommentsNumber());                                       
            Assert.assertEquals(2, statisticsCountPosts.getPostsNumber() / statisticsCountPosts.getUsersNumber());   
            Assert.assertEquals(0, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getUsersNumber());
            Assert.assertEquals(0, statisticsCountPosts.getCommentsNumber() / statisticsCountPosts.getPostsNumber());
        }else{
            System.out.println("Test: 'testCalculateAdvStatisticsWhenCommentsMoreThanPosts()' - FAILED\n " +
                    "because comments less than posts.");
        }
    }
}
