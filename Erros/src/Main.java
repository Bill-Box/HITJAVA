import java.io.*;
import java.util.RandomAccess;

public class Main {
    public static void validateEmail(String email) throws Exception{
        if(!email.contains("@")) {
            throw new Exception("Loi thieu @");
        }
        if(email == null || !email.isEmpty()) {
            throw new Exception("Email : null");
        }
    }
    public static void readFile(String file){
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line ;
            line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException ex){
            System.out.println("Loi doc File " + ex.getMessage());
        }
    }
    public static void wiritenfilr(String file, String noiDUngGhi){
        try{
            FileWriter fw = new FileWriter(file,true);
            fw.write(noiDUngGhi);
            fw.close();
        }catch (Exception e){
            System.out.println("Loi ghi file " + e.getMessage());
        }
    }

    public static void ghiFIlenhiNhan(String tenfile){
        try {
            FileOutputStream fos = new FileOutputStream(tenfile);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(123);
            dos.writeUTF("Jello");
            dos.close();
        }catch (Exception e){
            System.out.println("Loi " + e.getMessage());
        }
    }
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
        catch (Exception e){
            System.out.println("Xu ly Errors");
        }finally {
            System.out.println("Thuc hien");
        }

        try{
            validateEmail("");
        }catch (Exception e){
            System.out.print("Errors: " + e.getMessage() + "\n");
            e.printStackTrace();
        }

    }
}