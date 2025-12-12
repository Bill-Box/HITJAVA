public class Main {
    public static void main(String[] args) {
        // 1. Thông tin kết nối
        String url = "jdbc:mysql://localhost:3306/demo_db";
        String user = "root";
        String password = "123";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // 2. Mở kết nối (Lấy implementation từ Driver)
            conn = DriverManager.getConnection(url, user, password);

            // 3. Tạo câu lệnh (Dùng PreparedStatement để tránh SQL Injection)
            String sql = "SELECT * FROM users WHERE id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 10); // Truyền tham số

            // 4. Thực thi và hứng kết quả
            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Tên user: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. Đóng kết nối (Bắt buộc làm trong finally)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}