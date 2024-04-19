package Lesson3;

    public class Switch {
        public static void main(String[] args) {

            String comapany = "Orange";
            switch (comapany) {
                case "Orange":
                    System.out.println("Best company");
                    break;
                case "Allied Testing":
                    System.out.println("Main focus of QA");
                    break;
                case "EST Computer":
                    System.out.println("Main focus of Fronted");
                    break;
                default:
                    System.out.println("This company not existed");
            }

            int price = 500;
            switch (price){
                case 500:
                    System.out.println("Bingo");
                    break;
                case 600:
                    System.out.println("too expensive");
                    break;
                case 200:
                    System.out.println("too cheap");
                    break;
                default:
                    System.out.println(false);
            }

        }
    }

