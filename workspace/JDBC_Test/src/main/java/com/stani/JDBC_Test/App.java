package com.stani.JDBC_Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import oracle.net.aso.a;

import java.util.*;

/*
 * 
 *
 */
public class App {
	static final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
	// CONNECTION STRING (URL del DB)
	
	static final String DB_URL = "jdbc:oracle:thin:@marte.etlforma.com:8521:xe";
	static final String USER = "US08";
	static final String PASS = "etl38f$4";
    public static void main( String[] args ) 
    {
      
		
			//ExecuteSELECT();
			//ExecuteINSERT();
			String[] sel_val = {"0","70"};
			//ExecuteINSERT2();
			//ExecuteSELECT2(sel_val);
			//ExecuteStoredProcedure();
			ExecuteUPDATE();

	



    	
    	
    }

    
    private static void ExecuteUPDATE() {
    	
        Auto auto = new Auto(7, "88989","Renault","Megane",1,70);
        Connection conn = null;
        PreparedStatement stmt = null;
       
        try {
                conn = OpenDB();

                String sql = "UPDATE auto SET elettrica = ? WHERE modello = ? and potenza_kw > ?";

                stmt = conn.prepareStatement(sql);

                // MAPPING tra le proprietà della entity class e le colonne (segnaposto: ?)
                // della entity table
                Auto auto1 = new Auto();
             
                
                stmt.setInt(1, auto.getElettrica());
                stmt.setString(2, auto.getModello());
                stmt.setInt(3, auto.getKw());
             

                // STEP 3: Execute a query
                int row_cnt = stmt.executeUpdate();
                conn.commit();

                // STEP 4: Extract data from result set
                System.out.println("# di righe modificate = " + row_cnt);
        } catch (SQLException | ClassNotFoundException e) {
                try {
                        conn.rollback();
                } catch (SQLException e1) {
                        System.out.println(e.getMessage());
                }
                System.out.println(e.getMessage());
        } finally {
                try {
                        CloseDB(stmt, conn);
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }
        } // end try
		
	}


	private static void ExecuteStoredProcedure() {
        Connection conn = null;
        CallableStatement cstmt = null;

        try {
                conn = OpenDB();

                String sql = "{call get_auto_by_id(?, ?)}";

                cstmt = conn.prepareCall(sql);

                cstmt.setInt(1, 25);
//Registro il secondo parametro come un parametro di output
                cstmt.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);

                cstmt.execute();
                ResultSet rs = (ResultSet) cstmt.getObject(2);

                List<Auto> autos = new ArrayList<>();

                while (rs.next()) {
                        Auto auto = new Auto();

                        // Retrieve by column name: MAPPING fra entity class e entity table
                        // corrispondente
                        auto.setId(rs.getInt("ID"));
                        auto.setTarga(rs.getString("TARGA"));

                        auto.setMarca(rs.getString("MARCA"));
                        auto.setModello(rs.getString("MODELLO"));
                        auto.setElettrica(rs.getInt("ELETTRICA"));
                        auto.setKw(rs.getInt("potenza_kw"));

                        autos.add(auto);
                }
                System.out.println();
                System.out.print(autos);

        } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
        } finally {
                try {
					CloseDB(cstmt, conn);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					e.printStackTrace();
				}
        } // end try
}

    
    private static void ExecuteSELECT2(String[] sel_val) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
                conn = OpenDB();

                String sql = "SELECT * FROM auto WHERE elettrica = ? AND potenza_kw > ?";

       
                stmt = conn.prepareStatement(sql);

                // MAPPING tra le proprietà della entity class e le colonne (segnaposto: ?)
                // della entity table
                stmt.setInt(1, Integer.parseInt(sel_val[0]));
                stmt.setInt(2, Integer.parseInt(sel_val[1]));

                // STEP 3: Execute a query
                ResultSet rs = stmt.executeQuery();

                // STEP 4: Extract data from result set

                Auto auto = null;
                if (rs.next()) {
                        auto = new Auto();

                       
                       
                        // Retrieve by column name: MAPPING fra entity class e entity table
                        // corrispondente
                        auto.setId(rs.getInt("ID"));
                        auto.setTarga(rs.getString("TARGA"));

                        auto.setMarca(rs.getString("MARCA"));
                        auto.setModello(rs.getString("MODELLO"));
                        auto.setElettrica(rs.getInt("ELETTRICA"));
                        auto.setKw(rs.getInt("potenza_kw"));

                        System.out.println();
                        System.out.print(auto);
                        CloseDB(stmt, conn);

                }
                return;
        } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
                
        }
       
}


	private static void ExecuteINSERT2() {
        Auto auto = new Auto(12, "2A782", "OPEL", "Adams", 0, 90);
       
        Connection conn = null;
        PreparedStatement stmt = null;
       
        try {
                conn = OpenDB();

                String sql = "INSERT INTO auto VALUES (?, ?, ?, ?, ?, ?)";

                stmt = conn.prepareStatement(sql);

                // MAPPING tra le proprietà della entity class e le colonne (segnaposto: ?)
                // della entity table

                stmt.setInt(1, auto.getId());
                stmt.setString(2, auto.getTarga());
                stmt.setString(3, auto.getMarca());
                stmt.setString(4, auto.getModello());
                stmt.setInt(5, auto.getElettrica());
                stmt.setInt(6, auto.getKw());

                // STEP 3: Execute a query
                int row_cnt = stmt.executeUpdate();
                conn.commit();

                // STEP 4: Extract data from result set
                System.out.println("# di righe modificate = " + row_cnt);
        } catch (SQLException | ClassNotFoundException e) {
                try {
                        conn.rollback();
                } catch (SQLException e1) {
                        System.out.println(e.getMessage());
                }
                System.out.println(e.getMessage());
        } finally {
                try {
                        CloseDB(stmt, conn);
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }
        } // end try
       
       
}
	private static void ExecuteINSERT() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = OpenDB();
		
			String sql = "INSERT INTO auto VALUES (26,'IL92KLO','FIAT','SEICENTO',0,60)";
			
			stmt = CreateStatement(conn, sql);
	
			// STEP 3: Execute an "UPDATE" SQL statement
			int row_cnt = stmt.executeUpdate(sql);
			conn.commit();

			// STEP 4: Extract data from result set
			System.out.println("# di righe modificate = " + row_cnt);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			conn.rollback();
			System.out.println(e.getMessage());
		}
		CloseDB(stmt, conn);
	}

	private static void ExecuteSELECT() throws ClassNotFoundException ,SQLException{
		// Rappresenta una connessione con lo specifico database, tutto deve passare da qui
		Connection conn = OpenDB();
		String sql = "SELECT targa, marca, modello FROM auto WHERE potenza_kw > 70";
		Statement stmt = CreateStatement(conn, sql);
		ResultSet rs = stmt.executeQuery(sql);
		
		// STEP 4: Extract data from result set
		List<AutoView> autos = new ArrayList<AutoView>();
		// se esiste almeno una riga devo travasere la riga in auto view
		while(rs.next()) {
			AutoView autoView = new AutoView();
			// MAPPING fra entity class e enity table corrispondente
			autoView.setTarga(rs.getString("targa"));
			autoView.setMarca(rs.getString("marca"));
			autoView.setModello(rs.getString("modello"));
			
			System.out.println(autoView);
			
			autos.add(autoView);
			CloseDB(stmt, conn);
		}
		
	return;	
	}

	private static void CloseDB(Statement stmt, Connection conn) throws SQLException {
		// finally block used to close resources
	
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
	// nothing we can do
	}
private static Statement CreateStatement(Connection conn, String sql) throws SQLException {
	System.out.println("Creating statement...");

	return conn.createStatement();
	
	}

//lascio al metodo chiamante il compito di gestire l'eccezione
	private static Connection OpenDB() throws ClassNotFoundException, SQLException {
		// Registare un database, in questo caso deve installare JDBC per Oracle
		//load the JDBC driver for the database
		Class.forName(JDBC_DRIVER);
        System.out.println("Connecting to DB");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		return conn;
	}


}
