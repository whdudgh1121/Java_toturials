package org.opentutorials.javatutorials.interfaces.example2;
class CalculatorDummy implements Calculatable{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args) {
    	//CalculatorDummy c = new CalculatorDummy();  
    	//Dummy 부분을 지우고 실행 (가짜클래스인 Calculator를 실제 로직과 교체 ) 
        Calculator c = new Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}

//인터페이스는 반드시 public 이여야함
//