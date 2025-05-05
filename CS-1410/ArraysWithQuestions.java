import java.util.Scanner;

public class ArraysWithQuestions {

    public static String[] gettingToKnowYou(String [] questions) {
        System.out.println("Please answer the following questions:");
        Scanner _scanner = new Scanner(System.in);
        String[] answerStrings = new String[questions.length];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            answerStrings[i] = _scanner.nextLine();
        }
        return answerStrings;
    }

    public static boolean[] moreGettingToKnowYou(String[] questions) {
        System.out.println("\nPlease answer the following questions using only a y or n");
        Scanner _scanner = new Scanner(System.in);
        boolean[] answerBooleans = new boolean[questions.length];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String value = _scanner.nextLine();
            if (value.equals("y") == true) {
                answerBooleans[i] = true;
            } else {
                answerBooleans[i] = false;
            }
        }
        return answerBooleans;
    }

    public static void printQuestionWithAnswer(String [] questions, String [] answers) {
        System.out.println("\nThe following are those questions, and your answers");
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

    }

    public static void printQuestionWithTrueAnswer(String [] questions, boolean [] answers) {
        System.out.println("\nThe following are questions you answered true to");
        for(int i = 0; i < questions.length; i++){
            if(answers[i] == true){
                System.out.println(questions[i]);
            }
        }
    }

    public static void printQuestionWithFalseAnswer(String [] questions, boolean [] answers) {
        System.out.println("\nThe following are questions you answered false to");
        for(int i = 0; i < questions.length; i++){
            if(answers[i] == false){
                System.out.println(questions[i]);
            }
        }
    }

    public static int[] askUserFor10Ints() {
        System.out.println("Please enter your favorite 10 integers");
        Scanner _scanner = new Scanner(System.in);
        int[] favNumbers = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.print("enter number: ");
            favNumbers[i] = _scanner.nextInt();
        }
        return favNumbers;
    }

    public static void main(String[] args) {
        String[] questions = {"What makes you laugh the most?", "Who is your hero?", "If you could only eat one meal for the rest of your life, what would it be?", "Would you rather ride a bike, ride a horse, or drive a car?", "What did you want to be when you were small?", "What really makes you angry?", "What was your favorite vacation?", "How many pairs of shoes do you own?" };
        String [] answers = gettingToKnowYou(questions);
        printQuestionWithAnswer(questions, answers);

        String [] moreQuestions = {"Do you enjoy going to school?", "Have you ever burried a time capsule?", "Do you have a secret tallent?", "Do you belive in aliens?", "Do you have a sister or brother?", "Are you afraid of small spaces?", "Can you speak another language?", "Have you even met a celebrity?"};
        boolean[] moreAnswers = moreGettingToKnowYou(moreQuestions); 
        printQuestionWithTrueAnswer(moreQuestions,moreAnswers);
        printQuestionWithFalseAnswer(moreQuestions,moreAnswers);

        int[] theInts = askUserFor10Ints();
        System.out.print("\nHere are your favorite 10 ints:\n\t");
        if(theInts != null) {
            for(int i = 0; i < theInts.length; i++) {
                System.out.print(theInts[i] + " ");
            }
            System.out.println();
        }
    }

}
