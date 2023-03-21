import java.util.zip.Adler32;

public class CellCollection {
   Cell[] cells;
   int index;
   public void add(Cell c){
    cells[index]=c;
    index++;
   }
   public Cell get(int i){
    return cells[i];
   }
   public CellCollection(int size){
    cells = new cell(suze);
   }
}

// import java.util.ArrayList;

//public class TanpaGenerics {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList(); // arraylist tanpa generics
//
//        // tambahkan elemen ke list
//        list.add("Saya");
//        list.add("sedang");
//        list.add("belajar");
//        list.add("Java");

        // ambil elemen dari list dan cast ke tipe String
 //       String elemen1 = (String) list.get(0);
//        String elemen2 = (String) list.get(1);
//        String elemen3 = (String) list.get(2);
//        String elemen4 = (String) list.get(3);

        // cetak elemen-elemen yang diambil dari list
//        System.out.println(elemen1 + " " + elemen2 + " " + elemen3 + " " + elemen4);
//    }
//}
