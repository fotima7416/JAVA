package OOP.Foundtion.day1;

public class Main2 {
    public void SayHello(){
        System.out.print("Say Hello");
        Main3 main3=new Main3();
        main3.Teacher();
        ShowDetails();
    }

    public void ShowDetails(){
        this.SayHello();
    }
}
