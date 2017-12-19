package brigeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CleanNoNull {
    
   String url = "jdbc:mysql://localhost:3306/demo";
   String user = "";
   String password = "";
   String statment;
    
    public void readAndClean(){
         Scanner scann = new Scanner(System.in);
       
         System.out.println("Podaj login");
         user = scann.nextLine();
         System.out.println("Podaj Hasło");
         password = scann.nextLine();
         if(user!="root" && password!="andromeda1990"){
             System.out.println("sprobuj ponownie : hasło albo ogin jest nie poprawni3");
         }
         
    try {
   
        // 1. Dostęp
        Connection myCon = DriverManager.getConnection(url,user,password);
        // 2. sql Statment
        Statement mySt = myCon.createStatement();
        // 3. rezutat
        System.out.println("Podaj Id racownika ktorego chces usunuc zbazy");
       
        statment = scann.nextLine();
        do{
        mySt.executeUpdate("DELETE from employes where id ="+statment);
        }while(statment.isEmpty());
        // 4. wysłetenie atrybutow bazy danych
        System.out.println("Usowanie sie udało");
        
       
    } catch (Exception exc) {
                System.out.println("Coś poszło żle");
        
        exc.printStackTrace();
        
        
    }

    }

}
