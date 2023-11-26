package com.jagat.Encryption;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/encryption";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "pass123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("encryptedpassword");

        try {
            String secretKey = "gthyr2yete555ferertsghhjetweddsdfgfegwfw"; // Replace with a strong, random key
            String encryptedPassword = AESEncryption.encrypt(password, secretKey);

            User user = new User(username, encryptedPassword);

            // Store the user information in the database
            saveUserToDatabase(user);

            response.getWriter().println("Registration successful!");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error during registration.");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET requests if needed
        // This can be useful for displaying a registration form
        // For simplicity, let's redirect GET requests to the registration page
        response.sendRedirect(request.getContextPath() + "/registration.jsp");
    }

    private void saveUserToDatabase(User user) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO password (username, encryptedpassword) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getEncryptedPassword());
                preparedStatement.executeUpdate();

                System.out.println("Saved password in the database for user: " + user.getUsername());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception to propagate it up the stack
        }
    }
}
