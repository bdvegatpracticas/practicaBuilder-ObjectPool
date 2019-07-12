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
public abstract class ComputerBuilder {
    protected Computer computer;
    
    public Computer getComputer(){
        return computer;
    }
    
    public void createNewComputerProduct() {
        computer = new Computer();
    }

    public abstract void buildScreen();
    public abstract void buildColor(); 
    
}
