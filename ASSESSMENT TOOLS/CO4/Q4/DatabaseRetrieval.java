import java.sql.*;

public class DatabaseRetrieval {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/ecommerce";
        String username = "root";
        String password = "root";

        String query = "SELECT * FROM product";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("ID: "
                        + rs.getInt("id"));

                System.out.println("Name: "
                        + rs.getString("name"));

                System.out.println("Price: "
                        + rs.getDouble("price"));

                System.out.println("----------------");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Database Error: " + e.getMessage());
        }
    }
}
