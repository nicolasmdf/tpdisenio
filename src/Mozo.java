public class Mozo extends Personal {

    public Mozo(String nombre) {
        super(nombre, "Mozo");
    }

    public void asignarMesa(Mesa mesa, Cliente cliente) {
        if (!mesa.isOcupada()) {
            mesa.asignarCliente(cliente);
            cliente.setMesa(mesa);
            System.out.println("Mesa " + mesa.getNumero() + " asignada al cliente " + cliente.getNombre());
        } else {
            System.out.println("La mesa " + mesa.getNumero() + " ya está ocupada.");
        }
    }
}
