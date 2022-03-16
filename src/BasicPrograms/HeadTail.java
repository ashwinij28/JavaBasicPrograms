package BasicPrograms;

public class HeadTail {

    public static void main(String[] args) {
        int heads=0;
        int tails=0;
        if (Math.random() < 0.5) {
            heads+=1;
            int percentage=(heads/10)*100;
            System.out.println("Heads" + percentage +"%");

        } else {
            int percentage=(tails/10)*100;
            System.out.println("tails" + percentage +"%");

        }
    }
}


