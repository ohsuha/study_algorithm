package src;

import src.algorithm.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Study07 study07 = new Study07();
        try {
            study07.algorithm();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
