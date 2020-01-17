/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhi;

/**
 *
 *
 * @author schillaci.gabriel
 */
public class CiaoHiHello {

    public void run() {
        Say threadB = new Say();
        threadB.run("  CIAO  ");
        Say threadA = new Say();
        threadA.run("  HELLO  ");
        Say threadC = new Say();
        threadC.run("  HI  ");
    }
}
