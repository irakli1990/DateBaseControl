package readingFromDateBace;
import java.sql.*;

public class ReadFromMyBase  {
    
public static void read(){
    try {
        
        // 1. Dostęp
        Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","andromeda19902");
        // 2. sql Statment
        Statement mySt = myCon.createStatement();
        // 3. rezutat
        ResultSet myRes= mySt.executeQuery("select * from employes");
        // 4. wysłetenie atrybutow bazy danych
        while(myRes.next()){
            System.out.println("ID: "+myRes.getString("ID")+" |   "+"Imie: "+myRes.getString("first_name") + " | " + "Nazwisko: " + myRes.getString("last_name")+ " | " + "Data_urodzenia: "+myRes.getString("date_of_birth") + " | "+"Emeil: "+ myRes.getString("email"));
            System.out.println("=====================================================================================");
        }
    } catch (Exception exc) {
        
        exc.printStackTrace();
        
    }

    }
}