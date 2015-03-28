/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class SportDemo {
    

    public static void main(String []args){

        Sport s1, s2, s3, s4;
        s1 = new Football("Football", 11);
        s2=  new Tennis("Tennis",2, "racquet");
        s3 = new Basketball("Basketball", 5, "basket-ball");
        s4 = new Baseball("Baseball", 9, "baseball bat");
        s1.displayMessage();
        s2.displayMessage();
        s3.displayMessage();
        s4.displayMessage();
    }
}

