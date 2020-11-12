/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(strict=false, name="consulta_provinciero")
public class consulta_provinciero {
 
    @ElementList
    private List<prov> provinciero;

  
    public List<prov> getProvinciero() {
        return provinciero;
    }

    public void setProvinciero(List<prov> provinciero) {
        this.provinciero = provinciero;
    }

    @Override
    public String toString() {
        return "consulta_provinciero, provinciero=" + provinciero + '}';
    }
}
