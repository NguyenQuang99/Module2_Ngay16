package Optional_TH;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            br.close();
            System.out.println("Tong" + sum);

        } catch (Exception e) {
            System.out.println( "File ko ton tai 0r noi dung co loi");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
