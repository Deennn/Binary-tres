package Question5;

public class MyArrayList<T> {
    private T [] array;
    private int size = 0;

    public MyArrayList() {
        array = (T[]) new Object [8];
    }



    public void add(T value){
        if (array.length > size){
            array[size++] = value;
        } else {
            T [] newArr =  (T[]) new Object [size * 2];
            int index = 0;
            for(var any : array){
                newArr[index++] = any;

            }
            newArr[index++] = value;
            array = newArr;
            size = index;
        }
    }
    public T get (int index){
        try{
            return array[index];
        } catch (Exception exception){
            return  null;
        }
    }
    public int size(){
        return size;
    }

    @Override
    public  String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(int i = 0; i < size; i++){
            stringBuilder.append(array[i]);
            if (i != size - 1) stringBuilder.append(",");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }



}