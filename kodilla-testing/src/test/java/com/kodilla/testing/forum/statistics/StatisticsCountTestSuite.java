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
        Assert.assertEquals(5, statisticsMock.usersNames().size());
        Assert.assertEquals(10, statisticsMock.postsCount());
        Assert.assertEquals(20, statisticsMock.commentsCount());
        Assert.assertEquals(2, statisticsMock.postsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(4, statisticsMock.commentsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(2, statisticsMock.commentsCount() / statisticsMock.postsCount());
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
        Assert.assertEquals(5, statisticsMock.usersNames().size());
        Assert.assertEquals(1000, statisticsMock.postsCount());
        Assert.assertEquals(2000, statisticsMock.commentsCount());
        Assert.assertEquals(200, statisticsMock.postsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(400, statisticsMock.commentsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(2, statisticsMock.commentsCount() / statisticsMock.postsCount());
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
        Assert.assertEquals(5, statisticsMock.usersNames().size());
        Assert.assertEquals(10, statisticsMock.postsCount());
        Assert.assertEquals(0, statisticsMock.commentsCount());
        Assert.assertEquals(2, statisticsMock.postsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(0, statisticsMock.commentsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(0, statisticsMock.commentsCount() / statisticsMock.postsCount());
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
        Assert.assertEquals(0, statisticsMock.usersNames().size());
        Assert.assertEquals(5, statisticsMock.postsCount());
        Assert.assertEquals(10, statisticsMock.commentsCount());
        Assert.assertEquals(0, statisticsMock.postsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(0, statisticsMock.commentsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(2, statisticsMock.commentsCount() / statisticsMock.postsCount());
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
        Assert.assertEquals(100, statisticsMock.usersNames().size());
        Assert.assertEquals(200, statisticsMock.postsCount());
        Assert.assertEquals(5000, statisticsMock.commentsCount());
        Assert.assertEquals(2, statisticsMock.postsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(50, statisticsMock.commentsCount() / statisticsMock.usersNames().size());
        Assert.assertEquals(25, statisticsMock.commentsCount() / statisticsMock.postsCount());
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
            Assert.assertEquals(5, statisticsMock.usersNames().size());
            Assert.assertEquals(10, statisticsMock.postsCount());
            Assert.assertEquals(0, statisticsMock.commentsCount());
            Assert.assertEquals(2, statisticsMock.postsCount() / statisticsMock.usersNames().size());
            Assert.assertEquals(0, statisticsMock.commentsCount() / statisticsMock.usersNames().size());
            Assert.assertEquals(0, statisticsMock.commentsCount() / statisticsMock.postsCount());
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
            Assert.assertEquals(5, statisticsMock.usersNames().size());
            Assert.assertEquals(10, statisticsMock.postsCount());
            Assert.assertEquals(0, statisticsMock.commentsCount());
            Assert.assertEquals(2, statisticsMock.postsCount() / statisticsMock.usersNames().size());
            Assert.assertEquals(0, statisticsMock.commentsCount() / statisticsMock.usersNames().size());
            Assert.assertEquals(0, statisticsMock.commentsCount() / statisticsMock.postsCount());
        }else{
            System.out.println("Test: 'testCalculateAdvStatisticsWhenCommentsMoreThanPosts()' - FAILED\n " +
                    "because comments less than posts.");
        }
    }
}
