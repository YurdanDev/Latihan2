public class CellGenericCollection<T> {
    T[] cells;
    int index;
    public void add(T c){
        cells[index]=c;
        index++;
    }
    public T geT(int i){
        return cells[i];
    }
}
