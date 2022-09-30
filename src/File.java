import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
	public static void main(String[]args) throws IOException {

	// FileWriter nFile = new FileWriter("file1.txt");
	 //nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
     
     FileReader fr = new FileReader("file1.txt");
     Scanner scr1 = new Scanner(fr);
     
     while (scr1.hasNextLine()) {
         System.out.println(scr1.nextLine());
     }

     fr.close();
     //nFile.close();//для гита

}
}
