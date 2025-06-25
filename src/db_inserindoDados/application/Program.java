package db_inserindoDados.application;

import db_inserindoDados.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Connection conn = null;
    PreparedStatement st = null;
        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO seller " +
                    "(Name, Email, Birthdate, BaseSalary, DepartmentID) " +
                    "VALUES " +
                    "(?, ?, ?, ?, ?)");

            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gamil.com");
            st.setDate(3, new java.sql.Date(sdf.parse("24/06/1998").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}

