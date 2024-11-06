public class Cliente {
    private String nombre;
    private Mesa mesa;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void realizarPedido(Pedido pedido) {
        if (mesa != null && mesa.isOcupada()) {
            mesa.agregarPedido(pedido);
        } else {
            System.out.println("El cliente no tiene una mesa asignada o la mesa está libre.");
        }
    }
}
