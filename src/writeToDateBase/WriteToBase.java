package writeToDateBase;
import java.sql.*;
import java.util.Scanner;


public class WriteToBase {
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "root";
    String password = "andromeda1990";

    public void writeTobase() {
        
        Scanner scann = new Scanner(System.in);
       
            try{
String a,b,c,d,e;

                    Connection mycon = DriverManager.getConnection(url, user, password);
                  
                    Statement myst = mycon.createStatement();
                   
                    do
                    { 
                        System.out.println("podaj imie do bazy danych>>\n");
                        a = scann.nextLine();
                    }while(a.isEmpty());
                    
                    do
                    {        
                        System.out.println("podaj nazwisko do bazy danych>>\n");
                        b = scann.nextLine();
                    }while(b.isEmpty());
                    
                    do
                    {
                        System.out.println("podaj podaj data urodzenia do bazy danych yyyy-mm-dd>>\n");
                        c = scann.nextLine();
                    }while(c.isEmpty());
                    
                    do
                    {
                        System.out.println("podaj email do bazy danych>>\n");
                        d = scann.nextLine();
                    }while(d.isEmpty());
                    
                    do
                    {
                        System.out.println("podaj płec do bazy danych>>\n");
                        e = scann.nextLine();
                    }while(e.isEmpty());
                      
                    
                       
                                    String sql = "insert into employes" + "(first_name,last_name,date_of_birth,email,sex)" 
                                    + "values('" + a + "','" + b + "','" + c + "','" + d + "','" + e + "')";
                                    myst.executeUpdate(sql);
                                    System.out.println("dane sa dopisane do bazy danych");
                        
                  
                } catch (Exception exc) {
                    exc.printStackTrace();
                    System.out.println("Cos poszło niepoprawnie");

                }
             
        }

    }
