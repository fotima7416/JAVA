package OOP.day3;

public class Main2 {
    public String name;
    protected String surname;

    public  Main2(String name){
        this.name=name;
        System.out.println(this.name);

    }

    protected  void details(){
        System.out.print("Name: "+name+"\nSurname: "+surname);
    }
}
