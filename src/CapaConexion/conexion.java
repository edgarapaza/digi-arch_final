package CapaConexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    //variables miembro

    public static String usuario;
    public static String clave;
    public static String url;
    public static String bd;
    public static String driverClassName;
    public static Connection conn = null;
    public static Statement estancia;

//CONSTRUCTORES

    //Constructor que toma los datos de conexion por medio de parametros
    public conexion(String usuario, String clave, String url, String driverClassName, String bd) {
        this.usuario = usuario;
        this.clave = clave;
        this.url = url;
        this.bd = bd;
        this.driverClassName = driverClassName;
    }

    //Constructor que crea la conexion sin parametros con unos definidos en la clase
    //(meter los datos correspondientes)
    @SuppressWarnings("static-access")
    public conexion() {
        //poner los datos apropiados
        this.usuario = "root";
        this.clave = "admin";
        this.bd = "Periodicos";
        this.url = "jdbc:mysql://localhost/"+this.bd;
        this.driverClassName = "com.mysql.jdbc.Driver";
    }

    //metodos para recuperar los datos de conexion
    public String getClave() {
        return clave;
    }
    
    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public Connection getConn() {
        return conn;
    }    
    
     public String getbd() {
        return bd;
    }
    //metodos para establecer los valores de conexion
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsuario(String usuario) throws SQLException {
        this.usuario = usuario;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    
    public void setbd(String bd) {
        this.bd = bd;
    }
//la conexion propiamente dicha

    public void conectar() throws SQLException {
        try {
            Class.forName(this.driverClassName).newInstance();
            this.conn = DriverManager.getConnection(this.url, this.usuario, this.clave);
            //JOptionPane.showMessageDialog(null, "Conexion satisfactoria");
        } catch (ClassNotFoundException err) {
           JOptionPane.showMessageDialog(null,"Error " + err.getMessage());
        } catch (InstantiationException err) {
            JOptionPane.showMessageDialog(null,"Error " + err.getMessage());
        } catch (IllegalAccessException err) {
            JOptionPane.showMessageDialog(null,"Error " + err.getMessage());
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,"Error " + err.getMessage());
        }
    }
    //Cerrar la conexion

    public void cierraConexion() throws SQLException {
        this.conn.close();
    }

//METODOS PARA TRABAJAR CON LA BASE DE DATOS

    public ResultSet consulta(String consulta) throws SQLException {
        this.estancia = (Statement) conn.createStatement();
        return this.estancia.executeQuery(consulta);
    }

    public void actualizar(String actualiza) throws SQLException {
        this.estancia = (Statement) conn.createStatement();
        estancia.executeUpdate(actualiza);
    }

    public ResultSet borrar(String borra) throws SQLException {
        Statement st = (Statement) this.conn.createStatement();
        return (ResultSet) st.executeQuery(borra);
    }

    public int insertar(String inserta) throws SQLException {
        Statement st = (Statement) this.conn.createStatement();
        return st.executeUpdate(inserta);
    }

    void getConn(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
