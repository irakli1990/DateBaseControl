package main;
import java.sql.*;
import java.util.Scanner;
import readingFromDateBace.ReadFromMyBase;
import writeToDateBase.WriteToBase;
import brigeClass.CleanNoNull;

public class Main {
   public static void main(String []args){
       int writeReadClean;
       
       System.out.println("Wytam w Programie ....");
       System.out.println("==============================");
       do{
       Scanner scanner = new Scanner(System.in); 
      
       System.out.print( "________________________________\n"
               + ""+"1: zapysz danne do bazy danych \n"+
               "________________________________\n"
               + "2: Przeczytaj danne z bazy danych\n"+ 
               "________________________________\n"
               + "3: Usowanie danych\n"
               +"________________________________\n"
               +"0: EXIT\n"+ 
               "________________________________\n");
       writeReadClean=scanner.nextInt();
       
       
       switch(writeReadClean){
                case 1:
                    WriteToBase w ;
                    w=new WriteToBase();
                    w.writeTobase();
                    break;
                case 2:
                    ReadFromMyBase r;
                    r = new ReadFromMyBase();
                    r.read();
                    break;
                case 3:
                    CleanNoNull c;
                    c = new CleanNoNull();
                    c.readAndClean();
                    break;
                case 0:
                    System.out.println("do wydzienia ");
                    break;
                default:
                    System.out.println("nie matakej opcji:)");
                    break;
              
       }
       }while(writeReadClean!=0);
       
      

   
   }

   

}
