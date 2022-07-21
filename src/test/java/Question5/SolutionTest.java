package Question5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Loading solution;

    @BeforeEach
    void setUp() {

        solution = new Loading();
    }

    @Test
    void solution() {
        String CLIENT_REQUEST_FILE_LOCATION = "src/main/java/Question5/testing.txt";
        MyArrayList<String> expectedOutput = new MyArrayList<>();
        expectedOutput.add("NO");
        expectedOutput.add("YES");
        expectedOutput.add("YES");
        expectedOutput.add("NO");

        var actualOutput =  solution.solution(CLIENT_REQUEST_FILE_LOCATION);

        assertEquals(expectedOutput.toString(), actualOutput.toString());

    }

    @Test
    void solution1() {
        String CLIENT_REQUEST_FILE_LOCATION = "src/main/java/Question5/client-request-1.txt";
        MyArrayList<String> expectedOutput = new MyArrayList<>();
        expectedOutput.add("YES");
        expectedOutput.add("YES");
        expectedOutput.add("NO");
        expectedOutput.add("NO");
        expectedOutput.add("NO");
        expectedOutput.add("NO");
        expectedOutput.add("NO");
        expectedOutput.add("NO");


        var actualOutput =  solution.solution(CLIENT_REQUEST_FILE_LOCATION);

        assertEquals(expectedOutput.toString(), actualOutput.toString());

    }


}