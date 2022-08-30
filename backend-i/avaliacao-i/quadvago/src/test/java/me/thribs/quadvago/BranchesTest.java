package me.thribs.quadvago;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import me.thribs.quadvago.model.Branch;
import static me.thribs.quadvago.BranchService.addBranch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BranchesTest {

    private List<Branch> branches = null;
    Branch miami = new Branch("Miami", "161st", "9018 SW", "Miami", "Florida", true);
    Branch fiji = new Branch("Fiji", "Mavoa Rd", "Lot 1", "Walu Bay", "Suva", true);
    Branch thailand = new Branch("Thailand", "77 Road Bangjak", "2064 Sukhumvit", "Prakhanong", "Bangkok", false);
    Branch pyongiang = new Branch("Pyongiang", "Emperor blvd.", "666", "Pyongiang", "Dictionary", false);
    Branch madagascar = new Branch("Madagascar", "Rue Colbert Place Kabary", "69", "Antsiranana", "Antsiranana", true);
    
    @BeforeAll
    private void setup() {

        branches = new ArrayList<Branch>();
    }

    @Test
    private void addBranchTest() {
        branches.add(addBranch(miami));
        assertEquals(1, branches.size());
        branches.add(addBranch(fiji));
        assertEquals(2, branches.size());
        branches.add(addBranch(thailand));
        assertEquals(3, branches.size());
        branches.add(addBranch(pyongiang));
        assertEquals(4, branches.size());
        branches.add(addBranch(madagascar));
        assertEquals(5, branches.size());
    }
}
