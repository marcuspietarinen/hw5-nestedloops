package com.company;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 2, 5, 6, 8, 86};
        System.out.println(uniques(values));
    }
    static boolean uniques (int[] numbers)
    {
        boolean areTheyUnique = true;
        int index = 0;
        while (index < numbers.length)
        {
            for (int i = 0; i < index; i++)
            {
                if (numbers[i] == numbers[index])
                {
                    areTheyUnique = false;
                    break;
                }
            }
            for (int j = index + 1; j < numbers.length; j++)
            {
                if (numbers[j] == numbers[index])
                {
                    areTheyUnique = false;
                    break;
                }
            }
            index++;
        }
        return areTheyUnique;
    }
}
