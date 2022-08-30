package me.thribs.quadvago;

import org.apache.logging.log4j.Logger;

import me.thribs.quadvago.model.Branch;
import static me.thribs.quadvago.BranchService.addBranch;

import static org.apache.logging.log4j.LogManager.getLogger;

import java.util.ArrayList;
import java.util.List;

public class App {

    
    public static void main(String[] args) {
        
        Logger logger = getLogger();
        List<Branch> branches = new ArrayList<>();

        Branch miami = new Branch("Miami", "161st", "9018 SW", "Miami", "Florida", true);
        Branch fiji = new Branch("Fiji", "Mavoa Rd", "Lot 1", "Walu Bay", "Suva", true);
        Branch thailand = new Branch("Thailand", "77 Road Bangjak", "2064 Sukhumvit", "Prakhanong", "Bangkok", false);
        Branch pyongiang = new Branch("Pyongiang", "Emperor blvd.", "666", "Pyongiang", "Dictionary", false);
        Branch madagascar = new Branch("Madagascar", "Rue Colbert Place Kabary", "69", "Antsiranana", "Antsiranana", true);

        logger.info("Adicionando filiais à lista");            
        try {
            branches.add(addBranch(miami));
            logger.info(miami);
            branches.add(addBranch(fiji));
            logger.info(fiji);
            branches.add(addBranch(thailand));
            logger.info(thailand);
            branches.add(addBranch(pyongiang));
            logger.info(pyongiang);
            branches.add(addBranch(madagascar));
            logger.info(madagascar);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

    }
}
