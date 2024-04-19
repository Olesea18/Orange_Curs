package Lesson3;

    public class For {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                System.out.println("I" + " " + i);
            }
            for (int j = 0; j < 10; j = j + 2) {
                System.out.println("J" + " " + j);

            }

            for (int i = 0; i < 5; i++) {
                System.out.println("I" + " " + i);
                //Inner loop
                for (int j = 0; j < 10; j = j + 2) {
                    System.out.println("J" + " " + j);
                }
            }

            for(int i=0; i<10; i++) {
                System.out.println(i);
                if (i == 5) {
                    break;
                }
                System.out.println(i);

            }

        }
    }