package ru.example.sort;

public class SortApp
{
    public static void main(
        String[] args)
    {
        Integer maxSize = 100;
        ArrayBub array = new ArrayBub(maxSize);

        for(int i = 0; i < 20; i++)
        {
            array.insert((long) (i * Math.random()));
        }

        array.display();

        //array.bubbleSort();
        //array.selectionSort();
        array.insertionSort();

        array.display();
    }
}
