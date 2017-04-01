package ru.itis;

/**
 * Created by Sergey on 29.03.2017.
 */
public class CharSequence  implements Comparable{
    private char sequence[];

    public CharSequence (char[] sequence){
        this.sequence = sequence;
    }
     public int compareTo(Object object){
        char aSequence[] = this.sequence;
        char bSeauence[]  = ((CharSequence)object).sequence;
        int
        return 0;
     }
}
