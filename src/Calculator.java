
import java.util.*;
import java.io.*;
class Calculator {
    public static void main(String[]args) throws IOException {
    	 String s = "";
    	 File file = new File("input.txt");
         file.createNewFile();
         FileWriter writer = new FileWriter(file);
         writer.write("2 + 8"+"\n");
         writer.flush();
        // writer.close();
         //чтение из файла
         try(FileReader reader = new FileReader("input.txt"))
         {
             int c;
             while((c=reader.read())!=-1){
                 s+=(char)c;
             }
             System.out.println(s);
             }
         catch(IOException ex){
             System.out.println(ex.getMessage());
         }
         
         
        Scanner scr = new Scanner(System.in);
        String[]arr = scr.nextLine().split(" ");
        scr.close();
        boolean is_flag = true;
        
        double x=0,y=0,z=0;
        try {
        double a = Double.parseDouble(arr[0]);
        x = a;
        } catch (Exception ex) {
        System.out.println("Error! Not number");
            is_flag = false;
            writer.write("Error! Not number");
            writer.flush();
           // writer.close();
        }
        
        if(is_flag) {
        try {
        double b = Double.parseDouble(arr[2]);
        y = b;
        } catch (Exception ex) {
        System.out.println("Error! Not number");
             is_flag = false;
             writer.write("Error! Not number");
             writer.flush();
           //  writer.close();
        }}
        
        if(is_flag) {
        try {
        if(!(arr[1].equals("+")||arr[1].equals("-")||arr[1].equals("*")||arr[1].equals("/"))) {
           throw new Exception("Operation Error!");
        }
        } catch (Exception ex) {
          System.out.println(ex.getMessage());
             is_flag = false;
             writer.write("Operation Error!");
             writer.flush();
            // writer.close();
        }}
        
        if(is_flag) {
        try {
        if(arr[1].equals("/")&&arr[2].equals("0"))
            throw new ArithmeticException("Error! Division by zero");
        } catch (ArithmeticException ex) {
           System.out.println(ex.getMessage());
             is_flag = false;
             writer.write("Error! Division by zero");
             writer.flush();
            // writer.close();
        }}
        
         if(is_flag) {
         if(arr[1].equals("+")) {
            System.out.println(x+y);
              writer.write(String.valueOf(x+y));
              writer.flush();
             // writer.close();
         }
           
         if(arr[1].equals("-")) {
            System.out.println(x-y);
            writer.write(String.valueOf(x-y));
            writer.flush();
           // writer.close();
         }
           
         if(arr[1].equals("*")) {
            System.out.println(x*y);
            writer.write(String.valueOf(x*y));
            writer.flush();
           // writer.close();
         }
            
         if(arr[1].equals("/")) {
            System.out.println(x/y);
            writer.write(String.valueOf(x/y));
            writer.flush();
           // writer.close();
         }
       }
         writer.close();
        
    }//для гита
}