package pe.edu.upeu.modelo;

public class Productos{

    public String iDProducto;
    public String nombreProducto;
    public String unidadMedida;
    public double precio;
    public double stock;

    public String getiDProducto() {
        return iDProducto;
    }

    public void setiDProducto(String iDProducto) {
        this.iDProducto = iDProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
    
    
}