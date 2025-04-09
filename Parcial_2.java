import java.util.Scanner;

public class Parcialito2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion, cantidad;
        double precio = 0, subtotal = 0, descuento = 0, subtotalConDescuento = 0, iva = 0, total = 0;
        double totalGeneral = 0;

        do {
            System.out.println("\n=== Menú de Ventas ===");
            System.out.println("Por favor, seleccione el producto que desea adquirir:");
            System.out.println("1. Camisetas – Costo: $25.000");
            System.out.println("2. Pantalones – Costo: $45.000");
            System.out.println("3. Chaquetas – Costo: $65.000");
            System.out.println("4. Finalizar y salir");
            System.out.print("Digite su elección: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                String nombre = "";
                switch (opcion) {
                    case 1:
                        nombre = "Camisetas";
                        precio = 25000;
                        break;
                    case 2:
                        nombre = "Pantalones";
                        precio = 45000;
                        break;
                    case 3:
                        nombre = "Chaquetas";
                        precio = 65000;
                        break;
                }

                System.out.print("¿Cuántas unidades de " + nombre + " desea llevar? ");
                cantidad = sc.nextInt();

                subtotal = cantidad * precio;

                if (cantidad >= 3 && cantidad <= 4) {
                    descuento = subtotal * 0.10;
                } else if (cantidad > 4) {
                    descuento = subtotal * 0.15;
                } else {
                    descuento = 0;
                }

                subtotalConDescuento = subtotal - descuento;
                iva = subtotalConDescuento * 0.19;
                total = subtotalConDescuento + iva;
                totalGeneral += total;

                System.out.println("\n--- Detalle de la compra ---");
                System.out.println("Producto seleccionado: " + nombre);
                System.out.println("Precio por unidad: $" + precio);
                System.out.println("Cantidad comprada: " + cantidad);
                System.out.println("Subtotal antes de descuento: $" + subtotal);
                System.out.println("Monto de descuento: $" + descuento);
                System.out.println("Subtotal con descuento aplicado: $" + subtotalConDescuento);
                System.out.println("Impuesto (19% IVA): $" + iva);
                System.out.println("Monto total por este producto: $" + total);
            } else if (opcion != 4) {
                System.out.println("Selección inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        System.out.println("\n=================================");
        System.out.println("MONTO FINAL A CANCELAR: $" + totalGeneral);
        System.out.println("Gracias por elegirnos");
        sc.close();
    }
}