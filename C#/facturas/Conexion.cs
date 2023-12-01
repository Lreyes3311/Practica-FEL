using System.Data.SqlClient;

public static class Conexion
{
    public static SqlConnection ObtenerConexion()
    {
        string cadenaConexion = "jdbc:oracle:thin:@localhost:1521:xe";
        SqlConnection conexion = new SqlConnection(cadenaConexion);
        return conexion;
    }
}
