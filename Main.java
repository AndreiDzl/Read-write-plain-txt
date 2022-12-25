
package mainpackage;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int id = 10;
        String name = "Georgel";
//        String name1 = "Georgel";
//        System.out.println(name == name1); //true --In String pool se creeaza o singura variabila cu acelasi nume
//        System.out.println(name.equals(name1)); //true
        
       Person p  = new Person(id, name);
       p.sayMyName();
        changePerson(p);
        System.out.println(p.getId());
       
    }
    
    public static void changePerson(Person p){
        p.setId(20);
        
    }
}
