package org.util;

public class Convertor {

    public static int[] convertPayload(String payload) {
        String[] stringArray = payload.split(",");
        // declaring an array with the size of string
        int[] arr = new int[stringArray.length];
        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < stringArray.length; i++) {
            arr[i] = Integer.valueOf(stringArray[i]);
        }
        return arr;
    }

}
