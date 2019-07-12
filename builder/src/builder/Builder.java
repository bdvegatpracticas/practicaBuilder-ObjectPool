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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Director director = new Director();
        ComputerBuilder dc= new desktopComputerBuilder();
        ComputerBuilder portatil = new PortatilComputerBuilder();
        
        director.setComputerbuilder(dc);
        director.constructComputer();
        
        Computer comp = director.getComputer();
        System.out.println(comp.getClass());
        System.out.println(comp.getColor());
        System.out.println(comp.getScreen());
        
    }
}
