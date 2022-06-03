package src.javarandpass;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;

public class randpass {
    
    public static void main(String[] args){
        
    int max = 9;
    int min = 0;
    Random num = new Random();
    Random letter = new Random();
    Timer myTimer = new Timer();
        
    for (int i = 0; i < 2; i++){
        myTimer.schedule(new TimerTask(){
            @Override
            public void run() {
                //ll is "letterlower", while lu is "letterupper"    
                char ll = (char)(letter.nextInt(26) + 'a');
                char lu = (char)(letter.nextInt(26) + 'A');
                int n = min + num.nextInt(max);

                System.out.print(ll);
                System.out.print(n);
                System.out.print(lu);
                System.out.print(n);
                System.out.print(ll);
                System.out.print(n+"\n");
            }
        }, 0, 3000);
      }
    }
}
