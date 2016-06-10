package Palindrome;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by zihaocastine on 6/10/16.
 */
public class CheckEvenStringPalindromeTest{

    @Test
    public void palindromeCheckerTest(){
        HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("a",2);
        hashMap.put("b",2);
        CheckEvenStringPalindrome checkEvenStringPalindrome=new CheckEvenStringPalindrome(hashMap);

        Assert.assertTrue(checkEvenStringPalindrome.palindromeChecker());

    }

    @Test
    public void palindromeCheckerTest2(){
        HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("b",2);
        hashMap.put("b",2);
        hashMap.put("1",1);
        CheckEvenStringPalindrome checkEvenStringPalindrome=new CheckEvenStringPalindrome(hashMap);

        Assert.assertFalse(checkEvenStringPalindrome.palindromeChecker());

    }
}
