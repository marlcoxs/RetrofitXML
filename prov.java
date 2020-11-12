/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(strict=false)
class prov {
    @Element
    private int cpine;
    @Element
    private String np;//nombre provincia

    public int getCpine() {
        return cpine;
    }

    public void setCpine(int cpine) {
        this.cpine = cpine;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    @Override
    public String toString() {
        return "prov{" + "cpine=" + cpine + ", np=" + np + '}';
    }
}
