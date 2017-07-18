import java.io.*;
 
class File{
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:\\manis.file\\manis.txt");
        BufferedReader fileInput = new BufferedReader(file);
         
        // Print first 3 lines of file "C:\test\a.txt"
       // for (int counter = 0; counter < 2; counter++) 
            System.out.println(fileInput.readLine());
         
        fileInput.close();
    }
}