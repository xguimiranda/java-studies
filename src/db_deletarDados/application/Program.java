package db_deletarDados.application;


import db_deletarDados.DB;
import db_deletarDados.DBIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE "+
                            " Id = ?");


            st.setInt(1, 2); // Set the ID of the department to be deleted

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch(SQLException e){
            throw new DBIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}

