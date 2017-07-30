package com.polytop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PNumberTest {
  @Test
  public void negativeIndexTest() throws Exception {
    PNumber pNumber = new PNumber();

    boolean expected = false;
    boolean actual = pNumber.priNum(-1);
    assertEquals("BadCode", expected, actual);

  }

  @Test
  public void zeroIndexTest() throws Exception {
    PNumber pNumber = new PNumber();

    boolean expected = false;
    boolean actual = pNumber.priNum(0);
    assertEquals("BadCode", expected, actual);

  }

  @Test
  public void maxIndexTest() throws Exception {
    PNumber pNumber = new PNumber();

    boolean expected = false;
    int maxIndex = pNumber.getMaxIndex()+1;
    boolean actual = pNumber.priNum(maxIndex);
    assertEquals("BadCode", expected, actual);

  }





}