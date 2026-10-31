public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int gemAmount = 0;
    boolean isFinished = false;
    boolean isAlive = true;
    int health = 5;
    boolean tryAgain = false;

    System.out.println("\n===============");
    System.out.println("SERPENTINE");
    System.out.println("===============");
    System.out.println("PLAY          1");
    System.out.println("QUIT          2");
    System.out.println("===============");

    int menu = scanner.nextInt(); 

    scanner.nextLine();

    if(menu == 2){
        scanner.close();
        return;
    }

    while (isAlive && !isFinished) {

        tryAgain = false;

        // The little snake boy bit his toe.
        if (Math.random() > 0.5) {
            System.out.println("\nYou were bitten by a snake!");
            health--;
        }
        // The jeweller finds a gem.
        if (Math.random() > 0.5) {
            System.out.println("\nYou found a gem!");
            gemAmount++;
        } else {
            System.out.println("\nYou did not find any gem.");
        }

        System.out.println("-------------------");
        System.out.println("Health: " + health);
        System.out.println("Your gems: " + gemAmount);

        if (health == 0) {
            isAlive = false;
            System.out.println("\n                  YOU HAVE DIED   ");
            System.out.println("\nDo you wanna gamble with life again? (yeah / no): ");
            String answer = scanner.nextLine();

            if(answer.equals("no")){
                isFinished = true;
            } else {
                health = 5;
                gemAmount = 0;
                isAlive = true;
                tryAgain = true;
            }
        }

        if (isAlive && !tryAgain) {
            System.out.println("\nDo you wish to continue your journey? (yes / no): ");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                isFinished = true;
            }
        }
    }

    scanner.close();

}