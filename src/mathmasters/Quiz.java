package mathmasters;

import java.util.Scanner;

public class Quiz {
    private long startTime;
    private long endTime;
    private int attemptedQuestions;
    Player player = new Player();
    Scanner scan = new Scanner(System.in);


    public Quiz(){

    }

    public void welcomePlayer(){
        System.out.println("Welcome to Math Masters.\nPlease enter your name.");
        player.setName(scan.nextLine());
        System.out.println(String.format("Good luck %s.\nPress ENTER to continue...", player.getName()));
        scan.nextLine();
    }

    public void getResults(){
        System.out.println(String.format("Congratulations %s, you reached 100 points in %d attempts.", player.getName(), getAttemptedQuestions()));
        System.out.println(String.format("Your accuracy was: %.2f%c", (((float)100 / getAttemptedQuestions()) * 100), '%'));
        System.out.println(String.format("The time to reach 100 points was: %d seconds!", (getEndTime() - getStartTime()) / 1000));
    }

    public void setStartTime(long startTime){
        this.startTime = startTime;
    }

    public long getStartTime(){
        return this.startTime;
    }

    public void setEndTime(long endTime){
        this.endTime = endTime;
    }

    public long getEndTime(){
        return this.endTime;
    }

    public void addAttempt(){
        this.attemptedQuestions += 1;
    }

    public int getAttemptedQuestions(){
        return this.attemptedQuestions;
    }

}
