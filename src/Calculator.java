
import java.util.*;
import java.io.*;
class Calculator {
    public static void main(String[]args) throws IOException {
    	 String s = "";
    	 File file = new File("input.txt");
    	 File file1 = new File("output.txt");
         file.createNewFile();
         file1.createNewFile();
         FileWriter writer = new FileWriter(file,true);
         FileWriter writer1 = new FileWriter(file1,true);
       
         //чтение из файла
         /*try(FileReader reader = new FileReader("input.txt")) {
             int c;
             while((c=reader.read())!=-1){
                 s+=(char)c;
             }
             System.out.println(s);
             }
         catch(IOException ex){
             System.out.println(ex.getMessage());
         }*/
         
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[]arr = str.split(" ");
        scr.close();
        boolean is_flag = true;
        
        double x=0,y=0,z=0;
        try {
        double a = Double.parseDouble(arr[0]);
        x = a;
        } catch (Exception ex) {
        System.out.println(str+" = "+"Error! Not number");
            is_flag = false;
            writer.write(str+"\n");
            writer.flush();
            writer1.write(str+" = "+"Error! Not number"+"\n");
            writer1.flush();
        }
        
        if(is_flag) {
        try {
        double b = Double.parseDouble(arr[2]);
        y = b;
        } catch (Exception ex) {
        System.out.println(str+" = "+"Error! Not number");
             is_flag = false;
             writer.write(str+"\n");
             writer.flush();
             writer1.write(str+" = "+"Error! Not number"+"\n");
             writer1.flush();
        }}
        
        if(is_flag) {
        try {
        if(!(arr[1].equals("+")||arr[1].equals("-")||arr[1].equals("*")||arr[1].equals("/"))) {
           throw new Exception("Operation Error!");
        }
        } catch (Exception ex) {
          System.out.println(ex.getMessage());
             is_flag = false;
             writer.write(str+"\n");
             writer.flush();
             writer1.write(str+" = "+"Operation Error!"+"\n");
             writer1.flush();
        }}
        
        if(is_flag) {
        try {
        if(arr[1].equals("/")&&arr[2].equals("0"))
            throw new ArithmeticException("Error! Division by zero");
        } catch (ArithmeticException ex) {
           System.out.println(ex.getMessage());
             is_flag = false;
             writer.write(str+"\n");
             writer.flush();
             writer1.write(str+" = "+"Error! Division by zero"+"\n");
             writer1.flush();
        }}
        
         if(is_flag) {
         if(arr[1].equals("+")) {
            System.out.println(x+y);
              writer.write(str+"\n");
              writer.flush();
              writer1.write(str+" = "+String.valueOf(x+y)+"\n");
              writer1.flush();
         }
           
         if(arr[1].equals("-")) {
            System.out.println(x-y);
            writer.write(str+"\n");
            writer.flush();
            writer1.write(str+" = "+String.valueOf(x-y)+"\n");
            writer1.flush();
         }
           
         if(arr[1].equals("*")) {
            System.out.println(x*y);
            writer.write(str+"\n");
            writer.flush();
            writer1.write(str+" = "+String.valueOf(x*y)+"\n");
            writer1.flush();
         }
            
         if(arr[1].equals("/")) {
            System.out.println(x/y);
            writer.write(str+"\n");
            writer.flush();
            writer1.write(str+" = "+String.valueOf(x/y)+"\n");
            writer1.flush();
         }
       }
         writer.close();
        
    }//для гита
}