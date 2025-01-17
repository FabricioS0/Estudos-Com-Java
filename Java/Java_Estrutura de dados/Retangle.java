public class Retangle {
    public double altura;
    public double base;


    public void area(double area){
        area = 0;
        area = altura * base;
        System.out.println("Area = " + area);
    }
    public void perimetro(double perimetro){
        perimetro = 0;
        perimetro = 2*(altura + base);
        System.out.println("Perimetro = " + perimetro);
    }
    public void diagonal(double diagonal){
        diagonal = 0;
        diagonal = Math.sqrt(altura*2 + base*2);
        System.out.println("diagonal = " + diagonal);
    }
}
