package by.belstu.DimaKot;

public class TextFunc{
    public TextFunc() {
        System.out.println("Constructor");
    }

    public String getVAl() {
        sayKek();
        return "Hello from first project";
    }

    public void sayKek() {
        System.out.println("kek");
    }

    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void onCreate()    {
        for (int j = 0; j < 10; j++) {
            System.out.println("Counter   " + j);
        }
    }
}