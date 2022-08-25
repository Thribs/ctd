package me.thribs.dental_clinic.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import me.thribs.dental_clinic.model.AccessLevel;
import me.thribs.dental_clinic.model.User;
import static me.thribs.dental_clinic.JdbcConfig.getConnection;

@Service
public class UsersServiceImpl implements UsersService {

    Connection connection = null;

    @Override
    public void addUser(User user) {

        try {
            connection = getConnection();
            String insertUserSql = "insert into users (name, email, password, access_level) values ( ?, ?, ?, ?)";
            PreparedStatement insertUserStatement = connection.prepareStatement(insertUserSql);
            insertUserStatement.setString(1, user.getName());
            insertUserStatement.setString(2, user.getEmail());
            insertUserStatement.setString(3, user.getPassword());
            insertUserStatement.setString(4, user.getAccessLevel().getLabel());
            insertUserStatement.executeUpdate();
            ResultSet generatedKeys = insertUserStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                user.setId(generatedKeys.getInt(1));
            }
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<User> getUsers() {

        try {
            connection = getConnection();
            String selectAllUsersSql = "select * from users";
            Statement selectAllUsersStatement = connection.createStatement();
            ResultSet resultSet = selectAllUsersStatement.executeQuery(selectAllUsersSql);
            List<User> allUsers = new ArrayList<User>();
            while(resultSet.next()) {
                User user = new User(resultSet.getString("name"), resultSet.getString("email"), resultSet.getString("password"), AccessLevel.getByLabel(resultSet.getString("access_level")));
                allUsers.add(user);
            }
            return allUsers;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removeUser(int userId) {
    }
    
}
