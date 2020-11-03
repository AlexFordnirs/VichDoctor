import java.awt.color.ProfileDataException;

public class Pachient{
    private String Name;
    private int Age;
    private  String Pol;

    public Pachient (String Name,int Age,String Pol)
    {
        this.Name=Name;
        this.Age=Age;
        this.Pol=Pol;
    }
    public  void getDay(){
        System.out.println("Name: "+this.Name);
    }

    public String getName(){return Name;}
    public  String getPol(){return Pol;}
    public  int getAge(){return  Age;}
}
