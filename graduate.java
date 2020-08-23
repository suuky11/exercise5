/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex.pkg5;

/**
 *
 * @author SUUKY MASANAN
 */
public class graduate {
    public static void main(String[] args){
        Degree obj=new Degree();
        obj.getDegree();
        Undergraduate obj1=new Undergraduate();
        obj1.getDegree();
        Postgraduate obj2=new Postgraduate();
        obj2.getDegree();
    }
    
}
class Degree
{
    public void getDegree()
    {
    
        System.out.println("i got a degree");
    }
    
}
class Undergraduate extends Degree
{
    @Override
    public void getDegree()
    {
        System.out.println("i am an undergraduate");
    }
}
class Postgraduate extends Degree
{
    @Override
    public void getDegree()
    {
        System.out.println("i am a postgraduate");
    }
}

