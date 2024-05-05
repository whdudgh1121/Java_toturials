//package org.opentutorials.javatutorials.exception;
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//    	try {
//    		System.out.print("계산결과는 ");
//    		System.out.print(this.left/this.right);
//    		System.out.print(" 입니다.");
//    	} catch(Exception e) {
//    		System.out.println("오류가 발생했습니다 : " + e.getMessage());
//    	}
//    }
//} 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//try{} : 예외 발생이 예상되는 부분
//catch(예외 클래스 인스턴스){} : 예외가 발생햇을 때 실행되는 로직

package org.opentutorials.javatutorials.exception;
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
//e.getMessage : 오류에 대한 기본적인 내용 출력
//e.toString : e.getMessage보다 더 자세한 예외 정보를 출력
//e.printStackTrace() : 오류에 대한 자세한 예외 정보를 출력한다.

