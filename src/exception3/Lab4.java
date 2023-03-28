
package exception3;

public class Lab4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("Statement1");
            System.out.println(list[10]);
            System.out.println("Statement3");
        }
        catch (ArithmeticException e) {
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new RuntimeException();
        }
        finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }
}
