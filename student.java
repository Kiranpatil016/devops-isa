public class student {

    String name="kiran";
    int age=19;
    String month;
    int date;
    int year;

    public student(int date, String month, int year) {
        this.date=date;
        this.month=month;
        this.year=year;
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public void read(){
        System.out.print("Date of birth of the Student is ");
        System.out.print(date +"/" + month+"/"+year);
    }

    public static void main(String[] args){
        student s = new student(16, "August", 2004);
        s.display();
        s.read();
    }
}

