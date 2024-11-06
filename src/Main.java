public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto cerveza = new Producto("Cerveza", 5.0, "Bebida");
        Producto pizza = new Producto("Pizza", 12.0, "Comida");
        Producto vino = new Producto("Vino", 10.0, "Bebida");

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan Perez");

        // Crear mesas
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

        // Crear un mozo
        Mozo mozo1 = new Mozo("Carlos");

        // Asignar mesa al cliente
        mozo1.asignarMesa(mesa1, cliente1);

        // Verificar estado de la mesa
        System.out.println("Estado de la mesa 1: " + (mesa1.isOcupada() ? "Ocupada" : "Libre"));

        // Crear un pedido y agregar productos
        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(cerveza);
        pedido1.agregarProducto(pizza);

        // Cliente realiza el pedido
        cliente1.realizarPedido(pedido1);

        // Crear otro pedido para el mismo cliente
        Pedido pedido2 = new Pedido();
        pedido2.agregarProducto(vino);

        // Cliente realiza un segundo pedido
        cliente1.realizarPedido(pedido2);

        // Calcular el total de la mesa
        double totalMesa1 = mesa1.calcularTotal();
        System.out.println("Total de la cuenta de la mesa 1: $" + totalMesa1);

        // Mostrar detalles del pedido
        System.out.println("Detalles del pedido para la mesa " + mesa1.getNumero() + ":");
        for (Pedido pedido : mesa1.getPedidos()) {
            System.out.println("- Pedido:");
            for (Producto producto : pedido.getProductos()) {
                System.out.println("  * " + producto.getNombre() + " - $" + producto.getPrecio());
            }
            System.out.println("  Total del pedido: $" + pedido.calcularTotal());
        }

        // Liberar la mesa
        mesa1.liberarMesa();
        System.out.println("Estado de la mesa 1 después de liberar: " + (mesa1.isOcupada() ? "Ocupada" : "Libre"));
    }
}
