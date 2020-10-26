
package banco.controlador;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author victo
 */
@Named(value = "controlador")
@Dependent
public class montoDeposito {

    private montoDeposito obj = new montoDeposito();

    public montoDeposito() {
    }

    public montoDeposito getObj() {
        return obj;
    }

    public void setObj(montoDeposito obj) {
        this.obj = obj;
    }
    
    
    
}
