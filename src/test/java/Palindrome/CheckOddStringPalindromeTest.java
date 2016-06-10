package Palindrome;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by zihaocastine on 6/10/16.
 */
public class CheckOddStringPalindromeTest {
    @Test
    public void palindromeCheckerTest(){
        HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("a",2);
        hashMap.put("b",2);
        hashMap.put("c",1);
        CheckOddStringPalindrome checkOddStringPalindrome=new CheckOddStringPalindrome(hashMap);

        Assert.assertTrue(checkOddStringPalindrome.palindromeChecker());

    }

    @Test
    public void palindromeCheckerTest2(){
        HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("a",2);
        hashMap.put("b",2);
        hashMap.put("c",1);
        hashMap.put("d",1);
        CheckOddStringPalindrome checkOddStringPalindrome=new CheckOddStringPalindrome(hashMap);

        Assert.assertFalse(checkOddStringPalindrome.palindromeChecker());

    }


}
