package Palindrome;

import java.util.HashMap;

/**
 * Created by zihaocastine on 6/10/16.
 */
public class CheckOddStringPalindrome {
    HashMap<String,Integer> stringMap;
    public CheckOddStringPalindrome(HashMap<String, Integer> stringMap){
        this.stringMap=stringMap;
    }

    public boolean palindromeChecker(){
        int oddCounter=0;
        for(String each: stringMap.keySet()){
            if(stringMap.get(each)%2!=0){
                oddCounter+=1;
            }
        }

        return oddCounter==1;
    }
}
