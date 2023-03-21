import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        
        ArrayList<String> deleteHewan = new ArrayList<String>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        
        System.out.println("Hewan sebelum dihapus: " + hewan);
        
        Iterator<String> iterator = hewan.iterator();
        while (iterator.hasNext()) {
            String hewanSekarang = iterator.next();
            if (deleteHewan.contains(hewanSekarang)) {
                iterator.remove();
            }
        }
        
        System.out.println("Hewan setelah dihapus: " + hewan);
    }
}
