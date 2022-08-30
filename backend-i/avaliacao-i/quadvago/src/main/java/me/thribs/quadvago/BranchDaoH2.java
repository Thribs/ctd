package me.thribs.quadvago;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import me.thribs.quadvago.model.Branch;
import static me.thribs.quadvago.JdbcConfig.getConnection;

public class BranchDaoH2 implements IDao<Branch> {

    private Connection connection = null;

    @Override
    public Branch add(Branch branch) {

        try {
            connection = getConnection();
            String insertBranchSql = "insert into branches (name, address_street, address_number, address_city, address_state, is_five_stars) values ( ?, ?, ?, ?, ?, ? )";
            PreparedStatement ps = connection.prepareStatement(insertBranchSql);
            ps.setString(1, branch.getName());
            ps.setString(2, branch.getAddressStreet());
            ps.setString(3, branch.getAddressNumber());
            ps.setString(4, branch.getAddressCity());
            ps.setString(5, branch.getAddressState());
            ps.setBoolean(6, branch.isFiveStars());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) { 
                branch.setId(rs.getInt("id")); 
                ps.close();
                connection.close();
            }
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return branch;   
    }

}
