using System;

class Program
{
    static void Main()
    {
        // Puedes realizar pruebas de tu CRUD aquí
        FacturaDAO facturaDAO = new FacturaDAO();

        // Obtener y mostrar facturas
        var facturas = facturaDAO.ObtenerFacturas();
        foreach (var factura in facturas)
        {
            Console.WriteLine($"ID: {factura.Id}, Numero: {factura.Numero}, Monto: {factura.Monto}");
        }

        // Insertar una nueva factura
        Factura nuevaFactura = new Factura
        {
            Numero = "F2023001",
            Monto = 150.75
            // Puedes completar con otros campos según sea necesario
        };
        facturaDAO.InsertarFactura(nuevaFactura);

        // Actualizar una factura existente
        Factura facturaExistente = /* Obtener una factura existente por ID */;
        facturaExistente.Monto = 200.50;
        facturaDAO.ActualizarFactura(facturaExistente);

        // Eliminar una factura por ID
        int idFacturaAEliminar = /* ID de la factura a eliminar */;
        facturaDAO.EliminarFactura(idFacturaAEliminar);
    }
}
