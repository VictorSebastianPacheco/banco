
package banco.modelo;


public class banco {
    private cliente cliente;
    private String metodoOperar;
    private double depositoTotal;
    
    public banco(){
        
    }

    public banco(cliente cliente, String metodoOperar, double depositoTotal) {
        this.cliente = cliente;
        this.metodoOperar = metodoOperar;
        this.depositoTotal = depositoTotal;
    }
    public void montoDepositoDia(){
        this.cliente.getCantidad ();
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public String getMetodoOperar() {
        return metodoOperar;
    }

    public void setMetodoOperar(String metodoOperar) {
        this.metodoOperar = metodoOperar;
    }

    public double getDepositoTotal() {
        return depositoTotal;
    }

    public void setDepositoTotal(double depositoTotal) {
        this.depositoTotal = depositoTotal;
    }
    
    
    
    
}
