package de.bht.pr2.lab02.part1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

import de.bht.pr2.lab02.part2.BubbleSort;
import de.bht.pr2.lab02.part2.InsertionSort;
import de.bht.pr2.lab02.part2.QuickSort;

class MyTest {

  @Test
  void testSomething() {
    Student Klaus;
    try {
      Klaus = new Student("Klaus Kinski, 70089, Medieninformatik");
    } catch (StudentParseException | RegistrationNumberException | WrongCourseOfStudiesException
        | NotPaidTuitionFeeException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    //assertEquals(Klaus, Klaus);
  }

  @Test
  void testSorts(){
    int[] arr1 = {1,4,9,3,456,867,345,6876,9,1,99};
    int[] arr2 = {1,4,9,3,456,867,345,6876,9,1,99};
    int[] arr3 = {1,4,9,3,456,867,345,6876,9,1,99};

    BubbleSort.sort(arr1);
    InsertionSort.sort(arr2);
    QuickSort.sort(arr3);

    assertArrayEquals(arr1, arr2);
    assertArrayEquals(arr2, arr3);
    assertArrayEquals(arr1, arr3);
  }
}
