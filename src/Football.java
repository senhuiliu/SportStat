/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Football extends Sport{

public Football(String name, int pl){
super(name, pl);
}
public void displayMessage(){
System.out.println("Sport name is " + sportName);
System.out.println("Number of players who play this sport " + noOfPlayers);
System.out.println("Rest of the world calls this sport American Soccer");
System.out.println("--------------------------------------");
}
}