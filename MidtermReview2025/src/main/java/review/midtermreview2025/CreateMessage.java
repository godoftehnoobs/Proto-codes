package review.midtermreview2025;
import java.time.*;
public class CreateMessage {
    private String LastName;
    private String FirstName;
    private int YOB;
    
    public CreateMessage(String ln, String fn, int year){
        this.LastName=ln;
        this.FirstName=fn;
        this.YOB=year;
    }
    private String YMessage()
    {
        Year thisYear = Year.now();
        int y=thisYear.getValue();
        int age=y-this.YOB;
        if (age>40)
        {
            return this.LastName+", "+this.FirstName+" you are "+age+"years old . . . you are too old";
        }
        else
        {
            return this.LastName+", "+this.FirstName+" you are "+age+"Years old . . . . your are still young;";
        }
    }
    public void PrintMessage()
    {
        System.out.println(YMessage());
    }
    
}
