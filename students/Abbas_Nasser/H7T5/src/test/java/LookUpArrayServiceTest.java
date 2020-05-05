import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookUpArrayServiceTest {
    LookUpArrayService service = new LookUpArrayService();

    @BeforeEach
    void setUp() {
        service = new LookUpArrayService();
    }

    @Test
    void findMax() {
        String testMessage = "must find the highest number";
        int [] expected ={66, 77, 0};
        int [] [] array = {
                      {11, 22, 55, 66, 10},
                      {77, 44, 56, 21, 2},
                       { } };

        for (int i = 0; i < expected.length;i++){
            int actual = service.findMax(array[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void findMin() {
        String testMessage = "must find the lowest number";
        int [] expected ={10, 2, 0};
        int [] [] array = {
                {11, 22, 55, 66, 10},
                {77, 44, 56, 21, 2},
                { } };

        for (int i = 0; i < expected.length;i++){
            int actual = service.findMin(array[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void indexOfMax() {
        String testMessage = "must find the highest number's  index";
        int [] expected ={3, 0, -1};
        int [] [] array = {
                {11, 22, 55, 66, 10},
                {77, 44, 56, 21, 2},
                { } };

        for (int i = 0; i < expected.length;i++){
            int actual = service.indexOfMax (array[i]);
            assertEquals(expected[i], actual, testMessage);

        }
    }

    @Test
    void indexOfMin() {
        String testMessage = "must find the lowest number's  index";
        int [] expected ={4, 4, -1};
        int [] [] array = {
                {11, 22, 55, 66, 10},
                {77, 44, 56, 21, 2},
                { } };

        for (int i = 0; i < expected.length;i++){
            int actual = service.indexOfMin (array[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void indexOf() {  String testMessage = "must find  the index of the given number";
        int [] expected ={2, 2, -1};
        int [] value ={55, 56, -1};
        int [] [] array = {
                {11, 22, 55, 66, 10},
                {77, 44, 56, 21, 2},
                { } };

        for (int i = 0; i < expected.length;i++){
            int actual = service.indexOf (array[i], value[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }
}