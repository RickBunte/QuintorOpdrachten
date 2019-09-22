package Program;

import java.util.concurrent.atomic.AtomicLong;

public class ReverserAndCounter{
    public String reverser(String word){
        String reverse = "";
        for(int i = word.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }
    public int wordCounter(String sentence){
        int count = 0;
        for(int i = sentence.length() - 1; i >= 0; i--){
            count++;
        }
        return count;
    }
}