package src;

import src.algorithm.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Study06 study06 = new Study06();
        try {
            study06.algorithm();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
