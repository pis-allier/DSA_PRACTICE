package com.jagat.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jagat.Model.User;

public class UserDao {

	private String jdbcUrl = "jdbc:mysql://localhost:3306/user?useSSL=false";
	private String jdbcUser = "root";
	private String jdbcPassword = "pass123";

	private static final String INSERT_USER = "insert into user" + "(name, email, country ) values  " + "(?,?,?)";
	private static final String SELECT_USER_BY_ID = "select id , name, email,country from user where id = ?";
	private static final String SELECT_ALL_USERS = "select * from user";
	private static final String DELETE_USERS_SQL = "delete from user where id = ?;";
	private static final String UPDATE_USERS_SQL = "update user set name = ?,email= ?, country =? where id = ?;";

	public UserDao() {

	}

	protected Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return con;
	}

	public void insertUser(User user) throws SQLException {
		System.out.println(INSERT_USER);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getCountry());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	 public User selectUser(int id) {
	        User user = null;
	        // Step 1: Establishing a Connection
	        try (Connection connection = getConnection();
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
	            preparedStatement.setInt(1, id);
	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            ResultSet rs = preparedStatement.executeQuery();

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                String country = rs.getString("country");
	                user = new User(id, name, email, country);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return user;
	    }

	    public List < User > selectAllUsers() {

	        // using try-with-resources to avoid closing resources (boiler plate code)
	        List < User > users = new ArrayList < > ();
	        // Step 1: Establishing a Connection
	        try (Connection connection = getConnection();

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            ResultSet rs = preparedStatement.executeQuery();

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                String country = rs.getString("country");
	                users.add(new User(id, name, email, country));
	            }
	        } catch (SQLException e) {
	           e.printStackTrace();
	        }
	        return users;
	    }

	    public boolean deleteUser(int id) throws SQLException {
	        boolean rowDeleted;
	        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
	            statement.setInt(1, id);
	            rowDeleted = statement.executeUpdate() > 0;
	        }
	        return rowDeleted;
	    }

	    public boolean updateUser(User user) throws SQLException {
	        boolean rowUpdated;
	        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
	            statement.setString(1, user.getName());
	            statement.setString(2, user.getEmail());
	            statement.setString(3, user.getCountry());
	            statement.setInt(4, user.getId());

	            rowUpdated = statement.executeUpdate() > 0;
	        }
	        return rowUpdated;
	    }

}
