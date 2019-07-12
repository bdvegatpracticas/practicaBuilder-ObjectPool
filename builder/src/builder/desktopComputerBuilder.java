/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Estudiante
 */
public class desktopComputerBuilder extends ComputerBuilder{

    @Override
    public void buildScreen() {
        computer.setScreen("fullHD screen");
    }

    @Override
    public void buildColor() {
        computer.setColor("red");
    }
    
}
