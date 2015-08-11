
package CapaConexion;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Conecciones {
   private final String bd = "digitalizacion";
   private final String login = "root";
   private final String password = "admin";
   private final String url = "jdbc:mysql://localhost/"+bd;
   
   Connection conn = null;
   public Conecciones() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);
         if (conn!=null){
            System.out.println("Conexión a base de Dans "+bd+". listo");
         }
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }
  public void desconectar(){
         try {
              conn = null;
              conn.close();  //opcional pa terminar conexion    
              System.out.println("La conexion a la  base de datos "+bd+" a terminado");
         }catch (SQLException ex) {
            Logger.getLogger(Conecciones.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
   }
}
