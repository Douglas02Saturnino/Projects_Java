package Triangulo;

public class AreaRetangulo {
    
    public double h;
    public double b;
    

    public double area(){
        return b * h;    
    }

    public double perimetro(){
        return 2 * (b + h);
    }

    public double  diagonal(){
        return Math.sqrt((b * b) + (h * h));
    }

    public String toString(){
        return "Area: "
            + String.format("%.2f", area())
            + " "
            + "Perimetro: "
            + String.format("%.2f", perimetro())
            + " "
            + "Diagonal: "
            + String.format("%.2f", diagonal());
    
    }

}