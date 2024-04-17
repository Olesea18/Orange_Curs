package Lesson6;

public class Example1 {
    public static void main(String[] args) {
        try {
            int nr[] = {1, 3, 9};
            System.out.println(nr[0]);
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("is finished");
        }
    }
}