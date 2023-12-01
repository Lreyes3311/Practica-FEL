
package com.factura.main;

import com.factura.dao.FacturaElectronicaDAO;
import com.factura.model.FacturaElectronica;

/**
 *
 * @author lreye
 */
public class main {
    public static void main(String[] args) {
        FacturaElectronica factura = new FacturaElectronica(3, "Reyes", 100.0);
        
        // Crear factura
        FacturaElectronicaDAO.insertFactura(factura);

        // Mostrar facturas
        FacturaElectronicaDAO.selectFacturas();

        // Actualizar factura
        //FacturaElectronicaDAO.updateFactura(factura.getNumero(), 150.0);

        // Mostrar facturas después de la actualización
        FacturaElectronicaDAO.selectFacturas();

        // Eliminar factura
        //FacturaElectronicaDAO.deleteFactura(factura.getNumero());

        // Mostrar facturas después de la eliminación
        FacturaElectronicaDAO.selectFacturas();
    }
}
