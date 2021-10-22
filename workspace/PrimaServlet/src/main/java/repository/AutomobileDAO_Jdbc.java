package repository;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.Automobile;
 
public class AutomobileDAO_Jdbc {
        static final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
 
        // CONNECTION STRING (URL del DB)
        static final String DB_URL = "jdbc:oracle:thin:@marte.etlforma.com:8521:xe";
 
        // Database credentials
        static final String USER = "US08";
        static final String PASS = "etl38f$4";
 
        public List<Automobile> getAll() {
                Connection conn = null;
                Statement stmt = null;
               
                try {
                        conn = OpenDB();
 
                        String sql = "SELECT * FROM auto";
 
                        stmt = CreateStatement(conn, sql);
 
                        // STEP 3: Execute a query
                        ResultSet rs = stmt.executeQuery(sql);
 
                        // STEP 4: Extract data from result set
 
                        List<Automobile> autos = new ArrayList<>();
 
                        while (rs.next()) {
                                Automobile auto = new Automobile();
 
                                // Retrieve by column name: MAPPING fra entity class e entity table
                                // corrispondente
 

                				auto.setId(rs.getInt("id"));
                				auto.setTarga(rs.getString("targa"));
                				auto.setMarca(rs.getString("marca"));
                				auto.setModello(rs.getString("modello"));
                				auto.setElettrica(rs.getInt("elettrica"));
                				auto.setKw(rs.getInt("potenza_kw"));
 
                                autos.add(auto);
                        }
                       
                        return autos;
                } catch (ClassNotFoundException e) {
                        System.out.println(e.getMessage());
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }
 
                try {
                        CloseDB(stmt, conn);
                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }      
                return null;
        }
 
        private static Connection OpenDB() throws ClassNotFoundException, SQLException {
                // STEP 1: Register ORACLE JDBC driver
                Class.forName(JDBC_DRIVER);
 
                // STEP 2: Open a connection
                System.out.println("Connecting to database...");
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                return conn;
        }
 
        private static void CloseDB(Statement stmt, Connection conn) throws SQLException {
                // finally block used to close resources
                if (stmt != null)
                        stmt.close();
                if (conn != null)
                        conn.close();
        }
 
        private static Statement CreateStatement(Connection conn, String sql) throws SQLException {
                System.out.println("Creating statement...");
 
                return conn.createStatement();
 
        }

		
        public void save(Automobile auto) {
            Connection conn = null;
            PreparedStatement stmt = null;

            try {
                    conn = OpenDB();

                    String sql = "INSERT INTO auto VALUES (incrementaAuto.nextval, ?, ?, ?, ?, ?)";
                   
                    String[] generatedColumns = { "ID" };
                   
                    stmt = conn.prepareStatement(sql, generatedColumns);

                    // MAPPING tra le proprietà della entity class e le colonne (segnaposto: ?)
                    // della entity table

                    //stmt.setString(1, "auto_seq.nextval");
                    stmt.setString(1, auto.getTarga());
                    stmt.setString(2, auto.getMarca());
                    stmt.setString(3, auto.getModello());
                    stmt.setInt(4, auto.getElettrica());
                    stmt.setInt(5, auto.getKw());

                    // STEP 3: Execute a query
                    int row_cnt = stmt.executeUpdate();
                    conn.commit();
                    // STEP 4: GET ID
                    ResultSet generatedKeys = stmt.getGeneratedKeys();
                   
            if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    auto.setId(id);
            }
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

		public Automobile getAutoById(int auto_id) {
			
			  Connection conn = null;
		        PreparedStatement stmt = null;

		        try {
		                conn = OpenDB();

		                String sql = "SELECT * FROM auto WHERE id = ?";

		       
		                stmt = conn.prepareStatement(sql);

		                // MAPPING tra le proprietà della entity class e le colonne (segnaposto: ?)
		                // della entity table
		                stmt.setInt(1, auto_id);

		                // STEP 3: Execute a query
		                ResultSet rs = stmt.executeQuery();

		                // STEP 4: Extract data from result set

		                Automobile auto = null;
		                if (rs.next()) {
		                       auto = new Automobile();

		                       
		                       
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
		                        return auto;

		                }
		               
		        } catch (SQLException | ClassNotFoundException e) {
		                System.out.println(e.getMessage());
		               
		        }
				return null;
				
		       
		}

		public void update(Automobile auto) {
		        Connection conn = null;
		        PreparedStatement stmt = null;
		       
		        try {
		                conn = OpenDB();

		                String sql = "UPDATE auto SET elettrica = ?, targa = ?, marca = ?, modello = ?, potenza_kw = ? where id = ?";

		                stmt = conn.prepareStatement(sql);

		                // MAPPING tra le proprietà della entity class e le colonne (segnaposto: ?)
		                // della entity table
		             
		                stmt.setInt(1, auto.getElettrica());
		                stmt.setString(2, auto.getTarga());

		                stmt.setString(3, auto.getMarca());
		                stmt.setString(4, auto.getModello());

		                stmt.setInt(5, auto.getKw());
		                stmt.setInt(6, auto.getId());

		             

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
	}
		
		