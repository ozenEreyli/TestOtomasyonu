package org.rd.ta.sample.lesson_17;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

public class JDBISqlConnection {

    public static void main(String[] args) {


      String url = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10693174";
      String userName = "sql10693174";
      String password = "5EpIcaBHKN";
      Jdbi jdbi = Jdbi.create(url, userName, password);
        try (Handle handle = jdbi.open()) {

            handle.execute("CREATE TABLE IF NOT EXISTS Person (Id SERIAL PRIMARY KEY, Name VARCHAR(100))");
            handle.execute("INSERT INTO Person (Name) VALUES (?)", "Özen Ereyli");
            //handle.execute("UPDATE Person SET Name=(?) WHERE Id=2","Haktan Ereyli");

            String result = handle.createQuery("SELECT Name FROM Person WHERE id = :id")
                    .bind("id", 1)
                    .mapTo(String.class)
                    .one();
            System.out.println("Adı: " + result);
        }
        catch (StatementException e) {
            System.out.println(e.getMessage());
        }
    }

}
