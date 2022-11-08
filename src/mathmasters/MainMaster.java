package mathmasters;

import java.util.Scanner;

public class MainMaster {
    public static void main(String[] args) {
        //Create objects from each class.
        Quiz quiz = new Quiz();
        NumberGen rng = new NumberGen();
        Player player = new Player();
        Question question = new Question();
        Scanner scanner = new Scanner(System.in);

        //Welcome player and get player's name.
        quiz.welcomePlayer();

        //Collect time that game begins.
        quiz.setStartTime(System.currentTimeMillis());

        //While loop continues until
        //player gets 100 points.
        while(player.getPoints() < 100){
            question.setNum1(rng.getRandomZeroToNine());
            question.setNum2(rng.getRandomZeroToNine());

            //Gets a random number from 1-3 to decide which type of problem to give.
            if(rng.getRandomOneToThree() == 1){
                question.poseAddQuestion();
                if(scanner.hasNextInt() && scanner.nextInt() == question.getAddSolution()){
                    player.answerCorrect();
                } else {
                    player.answerIncorrect();
                    scanner.nextLine();
                }
            } else if(rng.getRandomOneToThree() == 2){
                question.poseSubQuestion();
                if(scanner.hasNextInt() && scanner.nextInt() == question.getSubSolution()){
                    player.answerCorrect();
                } else {
                    player.answerIncorrect();
                    scanner.nextLine();
                }
            } else {
                question.poseMultiQuestion();
                if(scanner.hasNextInt() && scanner.nextInt() == question.getMultiSolution()){
                    player.answerCorrect();
                } else {
                    player.answerIncorrect();
                    scanner.nextLine();
                }
            }
            //After each question is attempted, the attempt counter increases.
            quiz.addAttempt();
        }
        //The quiz is finished; the results are given.
        scanner.close();
        quiz.setEndTime(System.currentTimeMillis());
        quiz.getResults();

    }

}
