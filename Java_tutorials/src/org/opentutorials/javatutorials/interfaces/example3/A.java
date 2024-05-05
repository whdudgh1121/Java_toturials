package org.opentutorials.javatutorials.interfaces.example3;
 
interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class A implements I1, I2{
    public void x(){}
    public void z(){}   
}
//interface 는 구체적인 로직을 갖고있는 메소드를 포함하면 안 됨