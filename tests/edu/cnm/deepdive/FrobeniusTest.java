package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FrobeniusTest {
  int[] inputArray = {20, 9, 6};
  int value = 29;

  @ParameterizedTest
  @CsvFileSource(resources = "general-mcnugget-data.csv")
  void isGeneralMcNugget(int value, int[] packSizes) {
    assertEquals(false, Frobenius.isGeneralMcNugget(value, inputArray));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "mcnugget-data.csv", numLinesToSkip = 1)
  void isMcNugget(int value, boolean expected) {
    assertEquals(expected, Frobenius.isMcNugget(value));
  }



}