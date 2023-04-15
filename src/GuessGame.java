public class Main {
    public static void main(String[] args) {

        class GuessGame {
            Player p1;
            Player p2;
            Player p3;
            //Players


            public void StartGame() {
                p1 = new Player();
                p2 = new Player();
                p3 = new Player();

                int guessp1 = 0;
                int guessp2 = 0;
                int guessp3 = 0;
                //Guesses

                boolean p1isRight = false;
                boolean p2isRight = false;
                boolean p3isRight = false;
                //Validator

                int targetNumber = (int) (Math.random() * 10);//CapAmount
                System.out.println("I'm thinking of a number not higher than 10");

                while (true) {
                    System.out.println("Number to guess is " + targetNumber);

                    p1.guess();
                    p1.guess();
                    p1.guess();
                    //Guessing on each player

                    guessp1 = p1.number;
                    System.out.println("Player one guessed " + guessp1);

                    guessp1 = p2.number;
                    System.out.println("Player two guessed " + guessp2);

                    guessp1 = p3.number;
                    System.out.println("Player three guessed " + guessp3);
                    //Get each player guess by accessing the number variable of each.

                    if (guessp1 == targetNumber) {
                        p1isRight = true;
                        System.out.println("Player one got it right!!");
                    } else {
                        System.out.println("Player one got it wrong");
                    }
                    if (guessp1 == targetNumber) {
                        p2isRight = true;
                        System.out.println("Player two got it right!!");
                    } else {
                        System.out.println("Player two got it wrong");
                    }
                    if (guessp1 == targetNumber) {
                        p3isRight = true;
                        System.out.println("Player three got it right!!");
                    } else {
                        System.out.println("Player three got it wrong");
                    }

                    if (p1isRight || p2isRight || p3isRight) {
                        System.out.println("GREAT!!! YOU GOT IT!!");
                        break;
                    } else {
                        System.out.println("Try again players!!!");
                    }
                }

            }
        }
    }
}