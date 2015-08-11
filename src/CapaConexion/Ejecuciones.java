/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaConexion;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

 //import java.sql.CallableStatement;
public class Ejecuciones {
    Conecciones conectarse = new Conecciones();
    public boolean Ejecuciones(Object[] Argumentos, String ProcedimientoAlmacenado){
       boolean ok=false;       
       try 
       {  //CallableStatement Parametros = conectarse.getConnection().prepareCall("{call agreagaProducto (?,?,?)}");
          CallableStatement Parametros = Comandos(ProcedimientoAlmacenado);
          Cargar_Parametros(Parametros,Argumentos);
          Parametros.execute();
          Parametros.close();
          ok=true;
         }
       catch(SQLException e)
        {
         System.out.println(e);
        }
       return ok;
   }
    
    public void Cargar_Parametros(CallableStatement Parametros,Object[] Argumentos)
    {
            try {
                int Contador=1;
                for(int i=0;i<Argumentos.length;i++)
                  {  
                     Parametros.setObject(Contador, Argumentos[i]);
                     System.out.println("Mira aqui La clase Ejecuciones "+Contador+Argumentos[i].toString());  
                     Contador=Contador+1;
                  }
           }
           catch(SQLException e)
           {
                System.out.println(e);
           }
    }
    private  CallableStatement Comandos(String ProcedimientoAlmacenado)
    {
        CallableStatement Parametros = null;
        try {
            
            Parametros = conectarse.getConnection().prepareCall(ProcedimientoAlmacenado);
            //Parametros.close();
        }
        catch (Exception e) 
        {
           e.printStackTrace();
        }
        return Parametros;
     }
   
     public DefaultTableModel Obtener_Datos(String ProcedimientoAlmacenado,Object[] Argumentos)
     {    
            DefaultTableModel Tabla = new DefaultTableModel();  
        try{
            CallableStatement Parametros = Adaptador(ProcedimientoAlmacenado,Argumentos);
            ResultSet rs = Parametros.executeQuery();
            ResultSetMetaData md=rs.getMetaData();
            int columnas= md.getColumnCount();
            for (int i = 1; i <= columnas; i++) {
            Tabla.addColumn(md.getColumnLabel(i));}
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {fila[i]=rs.getObject(i+1);}
                Tabla.addRow(fila);
            }
            Parametros.close();
        }catch(SQLException e){
             System.out.println(e.getMessage());
        }
        return Tabla;
     }  
     public CallableStatement Adaptador(String ProcedimientoAlmacenado,Object[] Argumentos) 
     {
         CallableStatement Parametros = Comandos(ProcedimientoAlmacenado);
         if (Argumentos !=null)
         {
            Cargar_Parametros(Parametros,Argumentos);
         }
         return Parametros;
     }
     
     //Posiakaso
        public DefaultListModel abuuuuuuu(String ProcedimientoAlmacenado,Object[] Argumentos) 
      {//http://soloprogramacionjava.blogspot.com/2010/11/llenar-un-jtable-con-una-base-de-datos.html
            DefaultListModel modelo = new DefaultListModel();
            try {
            DefaultListModel defaultListModel = new DefaultListModel();

            int contador=1;
            String codigo="";
           
            
            CallableStatement Parametros = Adaptador(ProcedimientoAlmacenado,Argumentos);
            ResultSet resultados = Parametros.executeQuery();
            //Este while es quien llega la lista para luego utilizarla llenando el Jtable
            while(resultados.next()){
                codigo= resultados.getString(1);
                    defaultListModel.addElement(contador+". "+codigo);
                contador++;
            }
            Parametros.close();
            return defaultListModel;
            } catch (SQLException ex) {
            return modelo;
            }
    }
}
