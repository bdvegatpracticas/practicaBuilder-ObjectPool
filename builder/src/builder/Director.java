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
public class Director {
    public ComputerBuilder computerBuilder;

    public void setComputerbuilder(ComputerBuilder cb) {
        this.computerBuilder = cb;
    }
    
    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.createNewComputerProduct();
        computerBuilder.buildScreen();
        computerBuilder.buildColor(); 
    }
 
}
