package mainpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {
    
    public void writeFile(String fileName,Person p){
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(p.toString());
             fw.flush();
             fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void readFile(String fileName){
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String person = br.readLine();
            System.out.println(person);
            
            String[] tokens  =person.split(";");
            Person p = new Person(Integer.parseInt(tokens[0])
                    ,tokens[1]);
            
            System.out.println(p.getName());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
