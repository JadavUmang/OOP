public class RunTimePolyMorphism extends RunTimePolyMorphism1{
    public void run(){
        System.out.println("Excecuting The Parent Class Method");
    }
    public static void main(String[] args){
        RunTimePolyMorphism1 r = new RunTimePolyMorphism();
        r.run();
    }
}
class RunTimePolyMorphism1 {
    public void run(){
        System.out.println("Excecuting The Parent Class Method");
    }
}