import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomArrayList <T>implements CustomList<T > {

    Object[] items = new Object[10];
    private int size;
    //private Object[]items;
        @Override
        public boolean add(T item) {
            // TODO Auto-generated method stub
          if(size==items.length){increaseCapacity();
          }
          items[size++]= item;
            return true;
        }

        @Override
        public int getSize() {
            // TODO Auto-generated method stub
            return size;
        }

        @Override
        public T get(int index) {
            // TODO Auto-generated method stub
            return (T) items[index];
        }

        private void increaseCapacity(){
            int newSize=items.length*2;
        items= Arrays.copyOf(items,newSize);}

}
