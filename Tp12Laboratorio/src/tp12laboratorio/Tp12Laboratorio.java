/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp12laboratorio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tp12Laboratorio {

    public static void main(String[] args) {
        try {
            //1)
            Class.forName("org.mariadb.jdbc.Driver");
            //2)
            String bd = "jdbc:mariadb://localhost:3306/trabajopractico10"; 
            String usuario = "root"; 
            String password = ""; 
            Connection con = DriverManager.getConnection(bd, usuario, password);
//3)
//            String sql = "INSERT INTO  "
//                    + "empleado (dni, apellido, nombre, acceso, estado)  "
//                    + "VALUES (5900700, 'Caderas', 'Shakira', 2, false), "
//                    + " (3666777, 'Esponja', 'Bob', 1, true),"
//                    + " (12333444, 'Depp', 'Johnny', 3, true)";
//            
//                    
//            PreparedStatement ps = con.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0){
//                JOptionPane.showMessageDialog(null, "Empleado agregado");
//            }

//4)
//String sql = "INSERT INTO  "
//                    + "herramienta (idHerramienta, nombre, descripcion, stock, estado)  "
//                    + "VALUES (8, 'cinta', 'aisladora', 2, true),"
//                    + " (9, 'clavo', 'cruz', 12, false)"
//                    
//            PreparedStatement ps = con.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0){
//                JOptionPane.showMessageDialog(null, "Herramienta agregada");
//            }
    
    
//5)
//    String sql = "SELECT *  "
//                    + "FROM herramienta  WHERE stock > 10";
//                    
//            
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet resultado = ps.executeQuery(); 
//            while (resultado.next()){   next es un puntero boolenao
//                System.out.println("Id: "+resultado.getInt("idHerramienta"));
//                System.out.println("Nombre: "+resultado.getString("nombre"));
//                System.out.println("Descripción: "+resultado.getString("descripcion"));
//                System.out.println("Stock: "+resultado.getInt("stock"));
//                System.out.println("Estado: "+resultado.getBoolean("estado")); 

    
//6)
//    String sql = "UPDATE empleado SET estado = 0  WHERE idEmpleado = 1  ";
//                    
//                    
//            PreparedStatement ps = con.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0){
//                JOptionPane.showMessageDialog(null, "Empleado modificado");
//            }

            
        } catch (SQLException ex) {
            int codigoE = ex.getErrorCode();
            if (codigoE == 1062) {
                JOptionPane.showMessageDialog(null, "Entrada Duplicada");
            } else if (codigoE == 1049) {
                JOptionPane.showMessageDialog(null, "BD Desconocida");
            } else {
                JOptionPane.showMessageDialog(null, "Error ");
            }

            ex.printStackTrace();
            System.out.println("codigo de error " + ex.getErrorCode());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver");
        }
    }
}  