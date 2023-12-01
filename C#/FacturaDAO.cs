using System;
using System.Collections.Generic;
using System.Data.SqlClient;

public class FacturaDAO
{
    private SqlConnection conexion;

    public FacturaDAO()
    {
        conexion = Conexion.ObtenerConexion();
    }

    public List<Factura> ObtenerFacturas()
    {
        // Lógica para obtener facturas desde la base de datos
        // Retorna una lista de objetos Factura
        throw new NotImplementedException();
    }

    public void InsertarFactura(Factura factura)
    {
        // Lógica para insertar una factura en la base de datos
        throw new NotImplementedException();
    }

    public void ActualizarFactura(Factura factura)
    {
        // Lógica para actualizar una factura en la base de datos
        throw new NotImplementedException();
    }

    public void EliminarFactura(int idFactura)
    {
        // Lógica para eliminar una factura de la base de datos por su ID
        throw new NotImplementedException();
    }
}
