import java.util.concurrent.TimeUnit;

public class TimeOut {

    int count = 0;

    public int time(int a) throws InterruptedException
    {
        Boolean boi = true;

        for(int i = 0; i < a; i++)
        {
            System.out.println("count is at: " + count);
            TimeUnit.SECONDS.sleep(1);

            count++;
        }

        return count;
    }



}
