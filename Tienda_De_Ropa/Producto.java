public class Producto {
    @SuppressWarnings("unused")
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto(int cantidad, String nombre, double precio) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (cantidad >= 3 && cantidad <= 4) {
            return subtotal * 0.10;
        } else if (cantidad > 4) {
            return subtotal * 0.15;
        } else {
            return 0;
        }
    }

    public double calcularSubtotalConDescuento() {
        return calcularSubtotal() - calcularDescuento();
    }

    public double calcularIVA() {
        return calcularSubtotalConDescuento() * 0.19;
    }

    public double calcularTotal() {
        return calcularSubtotalConDescuento() + calcularIVA();
    }

    public String getNombre() {
        return nombre;
    }
}
