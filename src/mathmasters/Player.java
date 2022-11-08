package mathmasters;

public class Player {
    private String name;
    private int points = 0;
    private int attempts = 0;

    public Player(String name){
        this.name = name;
    }

    public Player(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addPoint(){
        this.points += 1;
    }

    public void subPoint(){
        this.points -= 1;
    }

    public int getPoints(){
        return this.points;
    }

    public void answerCorrect(){
        System.out.println("Correct.");
        this.addPoint();
    }

    public void answerIncorrect(){
        System.out.println("Wrong.");
        this.subPoint();
    }

    public void addAttempt(){
        this.attempts += 1;
    }
}
