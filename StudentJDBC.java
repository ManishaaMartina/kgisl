package com.mycompany.app;
import java.sql.*;
public class StudentJDBC
{
    Connection connection=null;
    PreparedStatement ptmt=null;
    ResultSet resultSet=null;
    public StudentJDBC()
    {}
    private Connection getConnection() throws SQLException
    {
        Connection conn=ConnectionFactory.getInstance().getConnection();
        return conn;
    }
    public void add(Student student) {
		try {
			String queryString = "INSERT INTO student(Rollnum, Name, Course, Address) VALUES(?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, student.getRollnum());
			ptmt.setString(2, student.getName());
			ptmt.setString(3, student.getCourse());
			ptmt.setString(4, student.getAddress());
			ptmt.executeUpdate();
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void update(Student student) {

		try {
			String queryString = "UPDATE student SET Name=? WHERE Rollnum=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setString(1, student.getName());
			ptmt.setInt(2, student.getRollnum());
			ptmt.executeUpdate();
			System.out.println("Table Updated Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

	public void delete(int rollnum) {

		try {
			String queryString = "DELETE FROM student WHERE Rollnum=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, rollnum);
			ptmt.executeUpdate();
			System.out.println("Data deleted Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void findAll() {
		try {
			String queryString = "SELECT * FROM student";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Roll No " + resultSet.getInt("Rollnum")
						+ ", Name " + resultSet.getString("Name") + ", Course "
						+ resultSet.getString("Course") + ", Address "
						+ resultSet.getString("Address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}