import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private double total;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
