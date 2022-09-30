
import java.util.*;
import java.io.*;
class Calculator {
    public static void main(String[]args) throws IOException {
    	
         FileWriter nFile = new FileWriter("file1.txt");
    	 nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
         
         FileReader fr = new FileReader("file1.txt");
         Scanner scr1 = new Scanner(fr);
         
         while (scr1.hasNextLine()) {
             System.out.println(scr1.nextLine());
         }
  
         fr.close();
         nFile.close();
         
         
        Scanner scr = new Scanner(System.in);
        String[]arr = scr.nextLine().split(" ");
        scr.close();
        scr1.close();
        boolean is_flag = true;
        
        double x=0,y=0,z=0;
        try {
        double a = Double.parseDouble(arr[0]);
        x = a;
        } catch (Exception ex) {
        System.out.println("Error! Not number");
            is_flag = false;
        }
        
        if(is_flag) {
        try {
        double b = Double.parseDouble(arr[2]);
        y = b;
        } catch (Exception ex) {
        System.out.println("Error! Not number");
             is_flag = false;
        }}
        
        if(is_flag) {
        try {
        if(!(arr[1].equals("+")||arr[1].equals("-")||arr[1].equals("*")||arr[1].equals("/"))) {
           throw new Exception("Operation Error!");
        }
        } catch (Exception ex) {
          System.out.println(ex.getMessage());
             is_flag = false;
        }}
        
        if(is_flag) {
        try {
        if(arr[1].equals("/")&&arr[2].equals("0"))
            throw new ArithmeticException("Error! Division by zero");
        } catch (ArithmeticException ex) {
           System.out.println(ex.getMessage());
             is_flag = false;
        }}
        
         if(is_flag) {
         if(arr[1].equals("+"))
            System.out.println(x+y);
           
         if(arr[1].equals("-"))
            System.out.println(x-y);
           
         if(arr[1].equals("*"))
            System.out.println(x*y);
            
         if(arr[1].equals("/"))
            System.out.println(x/y);
       }
        
    }
}