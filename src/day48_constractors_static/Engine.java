package day48_constractors_static;

public class Engine {

    private  int cyclinder;
    public Engine(){


    }

    @Override
    public String toString() {
        return "Engine{" +
                "cyclinder=" + cyclinder +
                '}';
    }

    public int getCyclinder() {
        return cyclinder;
    }

    public void setCyclinder(int cyclinder) {
        this.cyclinder = cyclinder;
    }

    public Engine(int cyclinder){



}

}
