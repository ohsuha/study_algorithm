package src;

import src.algorithm.Study02;
import src.algorithm.Study03;
import src.algorithm.Study04;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Study04 study04 = new Study04();
        try {
            study04.algorithm();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
