
package CapaMetodos;

import CapaConexion.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Validacion {
    
    conexion conn = new conexion();
    
    public int Validar(String usuario, String clave)
    {
        
        int rpta;
        try {
            conn.conectar();
            ResultSet res=conn.consulta("SELECT Id_usuario FROM usuario WHERE Nombre_usuario = '"+usuario+"' AND  Passwor = '"+clave+"';");
            res.next();
            int codigo = Integer.parseInt(res.getString(1));
            conn.cierraConexion();
            System.out.println("Ingreso al sistema el usuario con codigo:" + codigo);
            rpta = codigo;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
            rpta = 0;
        }
        System.out.println(rpta);
        return rpta;
    }
    
    public void Campos_Vacios(){
        
            
    }
}
