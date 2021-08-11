import homework.home.MainClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestTheFirst {

    public static Stream<Arguments> dataForTask1() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
        list.add(Arguments.arguments(new int[]{2, 3, 1, 7}, new int[]{1, 2, 4, 2, 3, 1, 7}));
        list.add(Arguments.arguments(new int[]{}, new int[]{1, 4}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForTask1")
    public void massTest(int[] arr1, int[] arr2){
        assertArrayEquals(arr1, MainClass.task1(arr2));
    }

    @Test
    public void TestException(){
        int[] arr = {1, 2, 3, 1};
        assertThrows(RuntimeException.class, () -> MainClass.task1(arr));
    }
}
