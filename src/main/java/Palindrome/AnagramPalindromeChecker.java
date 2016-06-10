package Palindrome;

import java.util.HashMap;

/**
 * Created by zihaocastine on 6/10/16.
 */
public class AnagramPalindromeChecker {
    private String input;
    HashMap<String,Integer> stringMap;
    AnagramPalindromeChecker(String input){
        this.input=input;
        stringMap=new HashMap<String, Integer>();
    }


    public String isPalindrome(){
        String [] inputArray=input.split("");
        for (String each: inputArray) {
            if(!stringMap.containsKey(each)){
                stringMap.put(each,1);
            }else {
                stringMap.put(each,stringMap.get(each)+1);
            }
        }

        return passToEvenOrOddPalindrome();
    }

    private String passToEvenOrOddPalindrome(){
        boolean result=false;
        if(input.length()%2==0){
            result= new CheckEvenStringPalindrome(stringMap).palindromeChecker();
        }else {
            result=new CheckOddStringPalindrome(stringMap).palindromeChecker();
        }

        if(result){
            return "YES";
        }else {
            return "NO";
        }
    }

}
