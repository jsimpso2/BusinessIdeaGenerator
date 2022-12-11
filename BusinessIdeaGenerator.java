import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//this is our main class that run main engine of our application
public class BusinessIdeaGenerator {

    //create a static scanner object to get user inputs
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {

        //call IdeasDataBase.getIdeas() to get all business ideas and store them in array
        BusinessIdea[] ideas=IdeasDataBase.getIdeas();

        //print welcome message on screen
        printWelcomeMessage();

        System.out.println("\n The System will ask some Questions and based upon your answer The System will Generate a Business Idea for you.");
        System.out.print("Press Enter to start......");
        input.nextLine();
        System.out.println();
        while (true)
        {

            //get username
            System.out.print("Please Enter your Name: ");
            String name=input.next();
            System.out.println("\nWhat is your level of education?\n 1:Less than a highschool diploma\n 2:Highschool degree or equivalent\n 3:Higher Education");
            System.out.print("Enter your Choice (number 1-3): ");
            int edu=input.nextInt();
            System.out.println("\nWhat is your budget to start the business?");
            System.out.print("Enter Budget in $: ");
            double budget=input.nextDouble();
            System.out.println("\nHow scalable would you like the business to be?(Enter a number between 1 to 10,(10 means highly scalable))");
            System.out.print("Enter your choice (number 1-10)");
            int scale=input.nextInt();
            System.out.println("\nGive a Market priority(\t1.New Business\t2.Existing Business)");
            System.out.println("Enter your Choice (number 1 or 2):");
            int priority=input.nextInt();

            System.out.println("\n\tThank you for your patience");
            System.out.println("\nGenerating Business Idea....\n");

            System.out.println("Press Enter See Results....");
            input.nextLine();
            input.nextLine();



            //create an empty reference we will use this reference in loop
            BusinessIdea businessIdea=null;
            //use loop to iterate through array of business
            for (int i=0;i<ideas.length;i++)
            {
                BusinessIdea next=ideas[i];
                Random random=new Random();
                //use level of education as input to switch statement
                switch (edu)
                {


                    case 1:
                        if(!next.isEducationRequired())
                        {
                           int r=random.nextInt(7);
                            if(r==1 && businessIdea==null)
                            {
                                businessIdea=next;
                                break;
                            }
                            if(budget+100>=next.getCostToStart() && budget-100<=next.getCostToStart())
                            {
                                if(scale+3>=next.getScalable()&& scale+3<next.getScalable()) {
                                     r=random.nextInt(3);
                                    if(r==1 && businessIdea==null)
                                    businessIdea = next;
                                }
                            }
                            else
                            if(budget+300>=next.getCostToStart())
                            {
                                 r=random.nextInt(3);
                                if(r==1 && businessIdea==null)
                                businessIdea=next;
                            }
                           else if(businessIdea==null)
                               businessIdea=next;
                        }
                        break;
                    case 2:
                    case 3:

                            if(budget+100>=next.getCostToStart())
                            {
                                if(scale+3>=next.getScalable()) {
                                    int r=random.nextInt(2);
                                    if(r==1 && businessIdea==null)
                                        businessIdea = next;
                                }
                            }
                            else
                            if(budget+200>=next.getCostToStart())
                            {
                                int r=random.nextInt(2);
                                if(r==1 && businessIdea==null)
                                    businessIdea=next;
                            }
                            else
                            if(budget+300>=next.getCostToStart())
                            {
                                int r=random.nextInt(2);
                                if(r==1 && businessIdea==null)
                                    businessIdea=next;
                            }
                            else if(businessIdea==null) {

                                businessIdea = next;
                            }

                        break;
                        }

            }


            System.out.println("\nBased on your answers the following business suits you:\n");
            System.out.println("\t"+businessIdea);
            System.out.println("\nPress 1 to generate another Idea or press 0 to exit");
            int choice=input.nextInt();
            if (choice==1)
                continue;
            else break;

        }

        System.out.println("\t\tGood Bye!");
        
    }

    public static void printWelcomeMessage()
    {
        Date date =new Date();
     System.out.println("\t\t ____________________________\n" +
             "\t\t|          WELCOME!          |\n" +
             "\t\t|             TO             |\n" +
             "\t\t|  Business Idea Generator   |\n" +
             "\t\t|"+date+"|\n"+
             "\t\t|____________________________|\n");
    }
}
