import homework.home.MainClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestTheSecond {

    public static Stream<Arguments> dataForTask2() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(true, new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
        list.add(Arguments.arguments(false, new int[]{1, 1, 1, 1, 1, 1}));
        list.add(Arguments.arguments(false, new int[]{4, 4, 4, 4}));
        list.add(Arguments.arguments(false, new int[]{1, 4, 4, 1, 1, 4, 3}));
        list.add(Arguments.arguments(false, new int[]{14, 41, 11, 44}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForTask2")
    public void massTest(boolean a, int[] arr1){
        assertEquals(a, MainClass.task2(arr1));
    }
}
