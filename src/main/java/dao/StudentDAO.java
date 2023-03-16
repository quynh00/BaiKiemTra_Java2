package dao;

import connection.MyConnection;
import model.Student;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;

public class StudentDAO {
    public List<Student> getAll() {
        final String sql = "SELECT * FROM `students`";
        List<Student> studentList = new ArrayList<>();

        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getString("id"));
                s.setFull_name(rs.getString("full_name"));
                s.setGender(rs.getInt("gender"));
                s.setDateOfBirth(rs.getString("dateOfBirth"));
                s.setAddress(rs.getString("address"));
                s.setPhone(rs.getString("phone"));
                s.setEmail(rs.getString("email"));
                s.setGpa(rs.getDouble("gpa"));
                studentList.add(s);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
    public Student getById(long id) {
        final String sql = "SELECT * FROM `products` WHERE  `id` = " + id;
        Student s = null;

        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                s.setId(rs.getString("id"));
                s.setFull_name(rs.getString("full_name"));
                s.setGender(rs.getInt("gender"));
                s.setDateOfBirth(rs.getString("dateOfBirth"));
                s.setAddress(rs.getString("address"));
                s.setPhone(rs.getString("phone"));
                s.setEmail(rs.getString("email"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public void insert(Student s){
        final String sql = String.format("INSERT  INTO `students` VALUES ( '%s','%s','%s','%s','%s','%s','%s','%f' ) ",
               s.getId(), s.getFull_name(), s.getGender(), s.getDateOfBirth(), s.getAddress(), s.getPhone(), s.getEmail(), s.getGpa()
        );
        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();
            long rs = stmt.executeUpdate(sql);

            if (rs == 0) {
                System.out.println("Thêm thất bại");
            }

            stmt.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }



}
