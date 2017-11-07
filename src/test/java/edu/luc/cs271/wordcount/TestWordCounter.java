package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

  // TODO complete this test class
  private Map<String, Integer> fixture;
  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter object = new WordCounter(fixture);

  @Before
  public void setUp() {
    // TODO create the SUT instance
    fixture = new HashMap<>();
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertTrue(fixture.isEmpty());;

  }

  @Test
  public void testGetCountNonEmpty() {
    Iterator it = Arrays.asList("asdf", "oiu", "oiu", "asdf", "qwer").iterator();
    object.countWords(it);
    assertEquals(2, object.getCount("asdf"));
    assertEquals(1, object.getCount("qwer"));
    assertNotEquals(2, object.getCount("qwer"));
    assertNotEquals(2, object.getCount("wer"));
    assertNotEquals(2, object.getCount("asd"));

//    assertEquals(3,fixture.size());
    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator

  }
}
