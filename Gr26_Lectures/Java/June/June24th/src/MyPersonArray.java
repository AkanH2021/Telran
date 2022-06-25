import java.util.Arrays;
import java.util.Iterator;

public class MyPersonArray implements Iterable{
    private Person2[] persons2;

    public MyPersonArray(Person2[] persons2) {
        this.persons2 = persons2;
    }

    @Override
    public String toString() {
        return "persons2=" + Arrays.toString(persons2);
    }

    @Override
    public Iterator iterator() {
        return new PersonIterator();
    }


    class PersonIterator implements Iterator<Person2> {

        private int index = 0;


        @Override
        public boolean hasNext() {
            return index < persons2.length;
        }

        @Override
        public Person2 next() {
            int temp = index;
            index++;
            return persons2[temp];  // may be written as  return persons2[index++];
        }
    }
}




