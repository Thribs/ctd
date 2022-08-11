package me.thribs.integers;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static me.thribs.integers.Integers.*;
/**
 * Hello world!
 *
 */
public class App 
{

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {

        // integers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        integers.add(11);

        if (isLongerThan5()) {
            logger.info("O comprimento da lista é maior que 5");
        }

        if (isLongerThan10()) {
            logger.info("O comprimento da lista é maior que 10");
        }

        logger.info("O valor médio da lista é: " + getAverage());

        if (integers.size() < 1) {
            logger.error("A lista está vazia");
            throw new RuntimeException("A lista está vazia");
        }
    
    }
}
