package com.corndel.pixmate.exercises;

public class Exercise1b {
  // https://tech-docs.corndel.com/java/for-each-loops.html

  /**
   * Adds together all the numbers in the array
   *
   * @example // returns 11 sumArray([1, 3, 7])
   * @param {int[]} arr - An array of numbers
   * @returns {int} The sum of the array
   */
  public static int sumArray(int[] arr) {
    var total = 0;

    for (var num : arr) {
      total += num;
    }

    return total;
  }
}
