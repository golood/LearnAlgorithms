package ru.example.massiv;

public class DataApp
{
    public static void main(String[] args)
    {
        Integer sizeMax = 100;
        DataArray array = new DataArray(sizeMax);

        for (int i = 0; i < 50; i++)
        {
            array.insert(new Person("Name " + i, "Surname " + i, i));
        }

        array.display();

        String searchKey = "Surname 27";
        Person found = array.find(searchKey);
        if (found != null)
        {
            System.out.print("Found: ");
            found.displayPerson();
        } else {
            System.out.println("Can't find " + searchKey);
        }

        System.out.println("Deleting Surname 1, Surname 20 and Surname 18");

        array.delete("Surname 1");
        array.delete("Surname 20");
        array.delete("Surname 18");

        array.display();

        DataArray sortArray = new DataArray(sizeMax);

        while (true)
        {
            Person person = array.removeMax();
            if (person != null)
            {
                sortArray.insert(person);
            } else {
                break;
            }
        }

        sortArray.display();
    }
}
