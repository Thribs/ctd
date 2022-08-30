package me.thribs.quadvago;

import me.thribs.quadvago.model.Branch;

public class BranchService {

    private static IDao<Branch> branchIDao = new BranchDaoH2();

    public static Branch addBranch(Branch branch) {
        return branchIDao.add(branch);
    }
}
