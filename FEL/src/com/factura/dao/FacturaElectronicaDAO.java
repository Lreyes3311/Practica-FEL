package com.factura.dao;

import com.factura.model.FacturaElectronica;
import com.factura.util.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lreye
 */
public class FacturaElectronicaDAO {
    
 private static final String INSERT_FACTURA = "INSERT INTO Facturas (Numero, Cliente, Monto) VALUES (?, ?, ?)";
    private static final String SELECT_FACTURAS = "SELECT * FROM Facturas";
    private static final String UPDATE_FACTURA = "UPDATE Facturas SET Monto = ? WHERE Numero = ?";
    private static final String DELETE_FACTURA = "DELETE FROM Facturas WHERE Numero = ?";

    public static void insertFactura(FacturaElectronica factura) {
        try (Connection conn = conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(INSERT_FACTURA)) {
            pstmt.setInt(1, factura.getNumero());
            pstmt.setString(2, factura.getCliente());
            pstmt.setDouble(3, factura.getMonto());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectFacturas() {
        try (Connection conn = conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SELECT_FACTURAS);
             ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                int numero = resultSet.getInt("Numero");
                String cliente = resultSet.getString("Cliente");
                double monto = resultSet.getDouble("Monto");
                System.out.println("Número: " + numero + ", Cliente: " + cliente + ", Monto: " + monto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateFactura(int numero, double nuevoMonto) {
        try (Connection conn = conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(UPDATE_FACTURA)) {
            pstmt.setDouble(1, nuevoMonto);
            pstmt.setInt(2, numero);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFactura(int numero) {
        try (Connection conn = conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(DELETE_FACTURA)) {
            pstmt.setInt(1, numero);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
