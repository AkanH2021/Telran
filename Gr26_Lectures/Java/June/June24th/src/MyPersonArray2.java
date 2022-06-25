import java.util.Arrays;
import java.util.Iterator;

public class MyPersonArray2 implements Iterable<>Person2, Iterator{
        private Person2[] persons2;

        public MyPersonArray2(Person2[] persons2) {
            this.persons2 = persons2;
        }

        @Override
        public String toString() {
            return "persons2=" + Arrays.toString(persons2);
        }

        @Override
        public Iterator iterator() {
            return (Iterator) this;
        }
}
