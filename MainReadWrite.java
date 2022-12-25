
package mainpackage;

public class MainReadWrite {
    public static void main(String[] args) {
//        ReadWriteFile rwf1 = new ReadWriteFile();
        Person p  = new Person(10, "Costel");
//        rwf1.writeFile("f1.txt", p);
//        rwf1.readFile("f1.txt");
       
        Serializare s = new Serializare();
//        s.writeFile("f2.txt", p);
        
        s.readFile("f2.txt");
        
    }
}
