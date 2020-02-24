package edu.cnm.deepdive;

public class Frobenius {

  /*Pack sizes are 6, 9, 20. */
  public static boolean isMcNugget(int value){
    //TODO Return true if value can be expressed as the sum of integral multiples (including
    // multiplication by zero) of the 3 original McNugget pack sizes; return false otherwise.
    return value >= 0
      && (
          value == 0
        ||isMcNugget(value - 20)
        ||isMcNugget(value - 9)
        ||isMcNugget(value - 6)
        );

  }

  /**
   * Determines if {@code value} can be expressed as the sum of non-negative integral multiples of
   * the elements of {@code packSizes}. (If we invoke {@code
   * isGeneralMcNugget(value, new int[]{20, 9, 6})}, the result returned should be identical to that
   * returned by {@link #isMcNugget(int) isMcNugget(value)}.
   *
   * @param value target/goal number.
   * @param packSizes array of distinct, positive {@code int }pack sizes, in descending order.
   * @return {@code true} if {@code value} is a McNugget number using the specific pack sizes,
   * {@code false} otherwise.
   */
  public static boolean isGeneralMcNugget(int value, int[] packSizes) {
    boolean flag = false;
    if (packSizes.length == 1 || packSizes.length == 0) {
      if (value >= 0) {
        if (value != 0) {
          isGeneralMcNugget(value - packSizes[0], packSizes);
        }
      }
      flag = true;
    }
    for (int packSize : packSizes) {
      int[] ithElementArray = {packSize};
      isGeneralMcNugget(value, ithElementArray);
    }
    return flag; // TODO Complete implementation for extra credit.

  }


}

