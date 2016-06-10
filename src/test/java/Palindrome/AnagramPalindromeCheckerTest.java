package Palindrome;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zihaocastine on 6/10/16.
 */
public class AnagramPalindromeCheckerTest {

    @Test
    public void isPalindromeTest(){
        AnagramPalindromeChecker anagramPalindromeChecker =new AnagramPalindromeChecker("aaabbbb");
        String expected="YES";
        String actual=anagramPalindromeChecker.isPalindrome();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void isPalindromeTest2(){
        AnagramPalindromeChecker anagramPalindromeChecker =new AnagramPalindromeChecker("cdefghmnopqrstuvw");
        String expected="NO";
        String actual=anagramPalindromeChecker.isPalindrome();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void isPalindromeTest3(){
        AnagramPalindromeChecker anagramPalindromeChecker =new AnagramPalindromeChecker("aabbcc");
        String expected="YES";
        String actual=anagramPalindromeChecker.isPalindrome();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void isPalindromeTest4(){
        AnagramPalindromeChecker anagramPalindromeChecker =new AnagramPalindromeChecker("a");
        String expected="YES";
        String actual=anagramPalindromeChecker.isPalindrome();
        Assert.assertEquals(expected,actual);

    }


}
