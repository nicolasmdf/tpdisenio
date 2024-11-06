import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private boolean estado; // true para ocupada, false para libre
    private List<Pedido> pedidos;
    private Cliente cliente;

    public Mesa(int numero) {
        this.numero = numero;
        this.estado = false; // Inicialmente libre
        this.pedidos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return estado;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
        this.estado = true; // Cambia el estado a ocupada
    }

    public void liberarMesa() {
        this.cliente = null;
        this.pedidos.clear();
        this.estado = false; // Cambia el estado a libre
    }

    public void agregarPedido(Pedido pedido) {
        if (estado) { // Solo permite agregar pedidos si la mesa está ocupada
            this.pedidos.add(pedido);
        } else {
            System.out.println("La mesa está libre, no se puede agregar un pedido.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
