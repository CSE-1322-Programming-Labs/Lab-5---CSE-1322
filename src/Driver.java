import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Item []itemArray = new Item[5];

        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            boolean BPtestPassed = false;
            while(!BPtestPassed) {
            System.out.println("Please enter B for book and P for periodical.");
            char userInput = sc.nextLine().toUpperCase().trim().charAt(0);
                switch (userInput) {
                    case 'B':
                        System.out.println("Please enter the title.");
                        String userTitle = sc.nextLine();
                        System.out.println("Please enter the author's name.");
                        String authorName = sc.nextLine();
                        System.out.println("Please enter the ISBN number.");
                        int ISBNnum = sc.nextInt();
                        itemArray[i] = new Book(ISBNnum, authorName, userTitle);
                        BPtestPassed = true;
                        break;
                    case 'P':
                        System.out.println("Please enter the title");
                        String periodicalTitle = sc.nextLine();
                        System.out.println("Please enter the issue number.");
                        int issueNumber = sc.nextInt();
                        itemArray[i] = new Periodical(issueNumber, periodicalTitle);
                        BPtestPassed = true;
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }

        //Print out the itemArray.
        for(int i=0;i<itemArray.length;i++){
            System.out.println(itemArray[i].getListing());
        }

    }
}
