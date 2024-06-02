package familyTree;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FamilyTreeSerializer {
    public void write(String path, FamilyTree obj){
        try {
            var outputStream = new ObjectOutputStream(new FileOutputStream(path));
            outputStream.writeObject(obj);
            outputStream.close();
        }
        catch (IOException e){
            System.out.println("File not exist or wrong path!");
        }
    }
    public FamilyTree read(String path){
        try{
            var inputStream = new ObjectInputStream(new FileInputStream(path));
            FamilyTree ft = (FamilyTree)inputStream.readObject();
            inputStream.close();
            return ft;
        }
        catch (IOException e){
            System.out.println("File not exist or wrong path!");
            return null;
        }
        catch (ClassNotFoundException e){
            System.out.println("Can't find class library!");
            return null;
        }
    }
}