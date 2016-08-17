package gps.mx.train.hackerrank.algorithms.sorting;

import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Gabe on 03/08/2016.
 */
public class InsertionSortingTest {

    private ByteArrayOutputStream stringOut;

    @BeforeMethod
    public void setUp() throws Exception {
        stringOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stringOut));

    }



    @Test
    public void firstSorting() throws Exception {
        int[] array = {2, 4, 6 ,8, 3};
        ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
        Solution.insertIntoSorted(array);
        String lineSeparator = System.getProperty("line.separator");
        Assert.assertEquals(stringOut.toString(),String.format("2 4 6 8 8 %1$s2 4 6 6 8 %1$s" +
                "2 4 4 6 8 %1$s2 3 4 6 8 %1$s", lineSeparator));
//        verify(out).println(equals("2 4 6 8 8 \n" +
//                "2 4 6 6 8 \n" +
//                "2 4 4 6 8 \n" +
//                "2 3 4 6 8 "));
    }
}
