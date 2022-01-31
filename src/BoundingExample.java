class Teacher{
    public void printTeacher(){
        System.out.println("in super-class (Teacher)");
    }
}

class MathTeacher extends  Teacher{
    public void printTeacher() {
        System.out.println("in sub-class (MathTeacher)");
    }
}

class EnglishTeacher extends  Teacher{
    public void printTeacher() {
        System.out.println("in sub-class (EnglishTeacher)");
    }
}

class ArabicTeacher extends  Teacher{
    public void printTeacher() {
        System.out.println("in sub-class (ArabicTeacher)");
    }
}

class Principal{
    public void print(){
        System.out.println("in class (Principal)");
    }
}

class Bounding<T extends Teacher>{

    private T object;

    public Bounding(T object){
        this.object=object;
    }

    public void showTeacher(){
        this.object.printTeacher();
    }
}
public class BoundingExample {
    public static void main(String [] args){

        Bounding <Teacher> t = new Bounding<Teacher>(new Teacher());
        t.showTeacher();

        Bounding <MathTeacher> mt = new Bounding<MathTeacher>(new MathTeacher());
        mt.showTeacher();

        Bounding <EnglishTeacher> et = new Bounding<EnglishTeacher>(new EnglishTeacher());
        et.showTeacher();

        Bounding <ArabicTeacher> at = new Bounding<ArabicTeacher>(new ArabicTeacher());
        at.showTeacher();

    }
}
