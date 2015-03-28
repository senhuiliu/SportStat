/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Tennis extends Sport{

    public String device;

    public Tennis(String name, int pl, String dev){
    super(name, pl);
    this.device = dev;
}
public void displayMessage(){
    
    System.out.println("Sport name is " + sportName);
    System.out.println("Number of players who play this sport " + noOfPlayers);
    System.out.println("Tennis is of 2 types : Table tennis and Lawn Tennis");
    System.out.println("Tennis is played with a " + device);
    System.out.println("--------------------------------------");
}
}

