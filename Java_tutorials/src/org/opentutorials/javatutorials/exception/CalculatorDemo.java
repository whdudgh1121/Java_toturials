package org.opentutorials.javatutorials.exception;

class DivideException extends Exception {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivideException{
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }
}
//e.getMessage : 오류에 대한 기본적인 내용 출력
//e.toString : e.getMessage보다 더 자세한 예외 정보를 출력
//e.printStackTrace() : 오류에 대한 자세한 예외 정보를 출력한다.



//IllegalArgumentException : 매개변수가 의도하지 않은 상황을 유발시킬 때
//IllegalStateException : 메소드를 호출하기 위한 상태가 아닐 때
//NullPointerException : 매개 변수 값이 null 일 때
//IndexOutOfBoundsException : 인덱스 매개 변수 값이 범위를 벗어날 때
//ArithmeticException : 산술적인 연산에 오류가 있을 때









