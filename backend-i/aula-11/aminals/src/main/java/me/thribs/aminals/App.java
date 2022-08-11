package me.thribs.aminals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static java.sql.DriverManager.getConnection;

/**
 * Hello world!
 *
 */
public class App {
    private static final String createTableSql = "create table if not exists animals (id int primary key auto_increment, name varchar(100) not null, tipo varchar(100) not null)";

    private static final String insertMaggieDogSql = "insert into animals (name, tipo) values ('Maggie', 'dog')";
    private static final String insertFidoDogSql = "insert into animals (name, tipo) values ('Fido', 'dog')";
    private static final String insertWhiskersCatSql = "insert into animals (name, tipo) values ('Whiskers', 'cat')";
    private static final String insertGarfieldCatSql = "insert into animals (name, tipo) values ('Garfield', 'cat')";
    private static final String insertManeHorseSql = "insert into animals (name, tipo) values ('Mane', 'horse')";
    private static final String insertBongaElephantSql = "insert into animals (name, tipo) values ('Bonga', 'elephant')";

    private static final String selectAllAnimalsSql = "select * from animals";

    private static final String deleteBongaElephantSql = "delete from animals where name = 'Bonga'";

    private static final String truncateAnimalsSql = "truncate table animals";

    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = getConnection("jdbc:h2:~/test","sa","");
            Statement statement = connection.createStatement();
            statement.execute(createTableSql);
            statement.execute(insertMaggieDogSql);
            statement.execute(insertFidoDogSql);
            statement.execute(insertWhiskersCatSql);
            statement.execute(insertGarfieldCatSql);
            statement.execute(insertManeHorseSql);
            statement.execute(insertBongaElephantSql);
            statement.execute(deleteBongaElephantSql);

            ResultSet animalsResultSet = statement.executeQuery(selectAllAnimalsSql);
            while (animalsResultSet.next()) {
                String name = animalsResultSet.getString("name");
                String tipo = animalsResultSet.getString("tipo");
                System.out.println(name + " is a(n) " + tipo);
            }

            statement.execute(truncateAnimalsSql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
