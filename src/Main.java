package src;

import src.algorithm.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Study08 study08 = new Study08();
        try {
            study08.algorithm();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
