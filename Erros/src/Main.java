import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
        Warring er = new Warring();
        String fileName = "doc.txt";
        try{
            RandomAccessFile ra = new RandomAccessFile(fileName, "rw");
            File newFile = new File(fileName);
            ra.writeInt(12);
            ra.writeBoolean(true);
            ra.writeUTF("Hello");
            ra.close();
            File checkFile = new File(fileName);
            if(checkFile.exists()){
                System.out.println(er.File_Exitis);
            }
            else System.out.println(er.File_UnExitis);
            String newName = "test.txt";
            File redName = new File(fileName);
            if(checkFile.exists()){
                if(checkFile.renameTo(newFile))
                    System.out.println(er.File_Name);
                else System.out.println(er.File_UnName);
            }
            else System.out.println(er.File_UnName);
            if(newFile.exists()){
                newFile.delete();
                System.out.println(er.File_Delete);
            }
            else System.out.println(er.File_UnDelete);
        }catch (IOException e){
            System.out.println("Loi" + e.getMessage());
        }

    }
}