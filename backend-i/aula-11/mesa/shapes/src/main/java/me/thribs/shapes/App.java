package me.thribs.shapes;

import static java.sql.DriverManager.getConnection;


/**
 * Hello world!
 *
 */
public class App 
{

    private static final Connection CONNECTION = getConnection("jdbc:h2:~/test","sa","");
    
    public static void main( String[] args )
    {
        
    }
}
