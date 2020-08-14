import java.util.HashMap;
import java.util.Hashtable;

public class test {
    public static void main(String[] args){
        System.out.println("Hello World");
        Hashtable<Double, String> ht =
                new Hashtable<Double, String>();
        ht.put(0.01, "ok");
        System.out.println(ht);
    }
}
