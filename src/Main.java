
public class Main {

    public static void main(String args[]) {
        String question = "Which alternative is correct:";
        String choiceOne = "A";
        String choiceTwo = "B";
        String choiceThree = "D";
                
        String correctAnswer = choiceTwo;
        
        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
         
        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();
        // If the user's input matches the correctAnswer...
        if(userInput.equals(correctAnswer))
        {
            System.out.println("Congrats");    
        }
        else
        {
            System.out.println("Wrong answer");
            System.out.println("the correct answer is" + "" + correctAnswer);
        }
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
