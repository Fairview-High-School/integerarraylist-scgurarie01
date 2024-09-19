public class IntegerArrayList implements IntegerList {

    private int capacity;
    private int size;
    private int[] data;
    public IntegerArrayList() {
        clear();
    }

    @Override
    public void add(Integer val) {
        add(size, val);
    }

    @Override
    public void add(int index, Integer val) {
        size++;
        checkIndex(index);
        if(size >= capacity) {
            increase();
        }

        int value = val;
        for(int i = index; i < size; i++) {
            int newValue = data[i];
            data[i] = value;
            value = newValue;
        }
    }

    private void increase() {
        capacity *= 2;
        int[] newData = new int[capacity];
        for(int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void decrease() {
        capacity /= 2;
        int[] newData = new int[capacity];
        for(int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void checkIndex(int index) {
        if(index >= size + 1 || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds for Size: " + size);
        }
    }

    @Override
    public void set(int index, Integer val) {
        data[index] = val;
    }

    @Override
    public void clear() {
        capacity = 10;
        size = 0;
        data = new int[capacity];
    }

    @Override
    public Integer remove(int index) {
        checkIndex(index);
        int returnValue = data[index];

        int value = data[size - 1];
        for(int i = size - 1; i >= index; i--) {
            int newValue = data[i];
            data[i] = value;
            value = newValue;
        }
        size--;
        if(size * 4 < capacity && capacity >= 20) { //array shouldn't have a size less than 10
            decrease();
        }

        return returnValue;
    }

    @Override
    public Integer get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer val) {
        return indexOf(val) != -1;
    }

    @Override
    public int indexOf(Integer val) {
        for (int i = 0; i < size; i++) {
            if (data[i] == val) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean equals(List<Integer> other) {
        if(size != other.size()) return false;
        for (int i = 0; i < size; i++) {
            if(data[i] != other.get(i)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if(i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}