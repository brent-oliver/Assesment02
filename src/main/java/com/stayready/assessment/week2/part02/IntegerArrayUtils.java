package com.stayready.assessment.week2.part02;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] ret = new Integer[integerArray.length + 1];

        for(int i = 0; i < integerArray.length; i++)
            ret[i] = integerArray[i];
        ret[ret.length - 1] = valueToBeAdded;

        return ret;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] ret = integerArray.clone();
        ret[indexToInsertAt] = valueToBeInserted;
        return ret;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] ret = integerArray.clone();

        for(int i = 0; i < ret.length; i++) {
            if(ret[i] % 2 == 0) {
                ret[i]++;
            } else {
                ret[i]--;
            }
        }

        return ret;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] ret = integerArray.clone();

        for(int i = 0; i < ret.length; i++) {
            if(ret[i] % 2 == 0)
                ret[i]++;
        }

        return ret;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] ret = input.clone();

        for(int i = 0; i < ret.length; i++) {
            if(ret[i] % 2 != 0)
                ret[i]--;
        }

        return ret;
    }
}
