package mathmasters;

public class Question {
    private int num1;
    private int num2;

    public Question(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Question(){

    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public void poseAddQuestion(){
        System.out.println(String.format("%d + %d = ?", this.num1, this.num2));
    }

    public int getAddSolution(){
        return this.num1 + this.num2;
    }

    public void poseSubQuestion(){
        System.out.println(String.format("%d - %d = ?", this.num1, this.num2));
    }

    public int getSubSolution(){
        return this.num1 - this.num2;
    }


    public void poseMultiQuestion(){
        System.out.println(String.format("%d * %d = ?", this.num1, this.num2));
    }

    public int getMultiSolution(){
        return this.num1 * this.num2;
    }

}
