package com.christober.learning.exceptionhandling.Errors;

public class StringForOutOfMemory {
    static void main() {
        String[] str = new String[900000000 * 900000000 * 900000000];
    }
}
