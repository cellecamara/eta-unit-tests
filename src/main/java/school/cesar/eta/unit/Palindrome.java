package school.cesar.eta.unit;

public class Palindrome {
    public boolean check(String word){
        int len = word.length();
        if (len<=1) {
            return true;
        }
        if(word.charAt(0) != word.charAt(len-1)){
            return false;
        }

        return check(word.substring(1,len-1));
    }
}