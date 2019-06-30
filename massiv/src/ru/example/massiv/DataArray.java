package ru.example.massiv;

public class DataArray
{
    private Person[] massiv;

    private Integer nElems;

    public DataArray(
        Integer max)
    {
        this.massiv = new Person[max];
        this.nElems = 0;
    }

    public Person find(
        String surname)
    {
        Integer i;

        for (i = 0; i < nElems; i++)
        {
            if (massiv[i].getSurname().equals(surname))
            {
                break;
            }
        }

        if (i == nElems)
        {
            return null;
        } else {
            return massiv[i];
        }
    }

    public void insert(
        Person person)
    {
        massiv[nElems] = person;
        nElems++;
    }

    public Boolean delete(
        String searchName)
    {
        Integer i;

        for (i = 0; i < nElems; i++)
        {
            if (massiv[i].getSurname().equals(searchName))
            {
                break;
            }
        }

        if (i == nElems)
        {
            return false;
        } else {
            for (int j = i; j < nElems; j++)
            {
                massiv[j] = massiv[j+1];
            }
            nElems--;
            return true;
        }
    }

    public void display()
    {
        for (int i = 0; i < nElems; i++)
        {
            massiv[i].displayPerson();
        }
    }

    public Integer getMax()
    {
        if (nElems != 0)
        {
            return nElems;
        } else {
            return -1;
        }
    }

    public Person removeMax()
    {
        if (getMax() != -1)
        {
            Person person = massiv[nElems-1];
            delete(person.getSurname());
            return person;
        } else {
            return null;
        }
    }
}
