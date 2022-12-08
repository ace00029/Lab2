package com.example.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TextCounterUnitTest {

    @Test
    public void getCharsCountTest01()
    {
        String inputString = "";
        String expectedResult = "0";

        String actualResult = TextCounter.getCharsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getCharsCountTest02()
    {
        String inputString = "      ";
        String expectedResult = "6";

        String actualResult = TextCounter.getCharsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getCharsCountTest03()
    {
        String inputString = "Hello world!";
        String expectedResult = "12";

        String actualResult = TextCounter.getCharsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getCharsCountTest04()
    {
        String inputString = ".d-w1º";
        String expectedResult = "6";

        String actualResult = TextCounter.getCharsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getWordsCountTest01()
    {
        String inputString = ".d-w1";
        String expectedResult = "2";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountTest02()
    {
        String inputString = "    ,/hello    ";
        String expectedResult = "1";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountTest03()
    {
        String inputString = " Hello, world!";
        String expectedResult = "2";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountTest04()
    {
        String inputString = "       Hey there !";
        String expectedResult = "2";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountTest05()
    {
        String inputString = "    . ,  ";
        String expectedResult = "0";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountTest06()
    {
        String inputString = "  XS_1  . ,  ";
        String expectedResult = "1";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountTest07()
    {
        String inputString = "  testing_0fff001  ";
        String expectedResult = "2";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountTest08()
    {
        String inputString = "  testing _ 0fff001  ";
        String expectedResult = "2";

        String actualResult = TextCounter.getWordsCount(inputString);
        assertEquals(expectedResult, actualResult);
    }
}