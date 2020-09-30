package CopyFileText;

import java.io.*;
import java.util.Scanner;

public class File {

    public  void writeFile(String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("Hello");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("File ko ton tai or noi dung co loi");
        }
    }
    public  void readFile(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ( (line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("File ko ton tai or noi dung co loi");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duong dan file :");

        String path = scanner.nextLine();
        File copy = new File();
        copy.writeFile(path);
        copy.readFile(path);





    }
}
