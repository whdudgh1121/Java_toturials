//package org.opentutorials.javatutorials.exception;
// 
//class A{
//    private int[] arr = new int[3]; // 이 배열은 3개의 값을 담을 수 있음
//    A(){
//        arr[0]=0;
//        arr[1]=10;
//        arr[2]=20;
//    }
//    public void z(int first, int second){
//        System.out.println(arr[first] / arr[second]);
//    }
//}
// 
//public class ExceptionDemo1 {
//    public static void main(String[] args) {
//        A a = new A();
//        a.z(10, 1); // 배열은 3개의 값을 담을 수 있지만 10번째의 값을 호출하고 있음 에러발생
//    }
//}

//package org.opentutorials.javatutorials.exception;
// 
//class A{
//    private int[] arr = new int[3];
//    A(){
//        arr[0]=0;
//        arr[1]=10;
//        arr[2]=20;
//    }
//    public void z(int first, int second){
//        System.out.println(arr[first] / arr[second]);
//    }
//}
// 
//public class ExceptionDemo1 {
//    public static void main(String[] args) {
//        A a = new A();
//        a.z(1, 0); //이 코드에서 10/0을 실행하는데 0으로 나누는것은 불가능. 같은 로직이지만 다른 예외가 발생할 수 있음
//    }
//}

package org.opentutorials.javatutorials.exception;
 
class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {
        	System.out.println("finally");
        }
         
    }
}
 
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}