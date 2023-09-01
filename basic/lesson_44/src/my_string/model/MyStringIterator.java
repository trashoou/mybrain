package my_string.model;

import my_string.MyString;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    private StringBuilder str;
    private int size;
    private int currPosition;


    public MyStringIterator(StringBuilder str){
        this.str = str;
        size = str.length();
        // currPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currPosition < size; // логическое выражение, которое отражает логику наличия
    }

    @Override
    public Character next() {
        Character curCharacter = str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }

    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}
