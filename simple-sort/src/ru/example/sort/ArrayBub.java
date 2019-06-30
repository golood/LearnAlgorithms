package ru.example.sort;

public class ArrayBub
{
    private Long[] massiv;

    private Integer nElems;

    public ArrayBub(
        Integer max)
    {
        massiv = new Long[max];
        nElems = 0;
    }

    public void insert(
        Long value)
    {
        massiv[nElems] = value;
        nElems++;
    }

    public void display()
    {
        for (int i = 0; i < nElems; i++)
        {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort()
    {
        for (int i=nElems-1; i > 1; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (massiv[j] > massiv[j+1])
                {
                    swap(j, j+1);
                }
            }
        }
    }

    public void selectionSort()
    {
        Integer min;

        for (int i = 0; i < nElems-1; i++)
        {
            min = i;
            for (int j = i+1; j < nElems; j++)
            {
                if (massiv[j] < massiv[min])
                {
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    public void insertionSort()
    {
        for (int i = 1; i < nElems; i++)
        {
            Long currElem = massiv[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && massiv[prevKey] > currElem)
            {
                massiv[prevKey+1] = massiv[prevKey];
                massiv[prevKey] = currElem;
                prevKey--;
            }
        }
    }

    private void swap(
        Integer one,
        Integer two)
    {
        Long temp = massiv[one];
        massiv[one] = massiv[two];
        massiv[two] = temp;
    }
}
