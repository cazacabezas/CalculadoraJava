package es.cice.logic;





public  class Calculadora {
    
    public static double sumar(String numA,String numB){
        return Double.valueOf(numA) + Double.valueOf(numB);
    }
    
    public static double restar(String numA,String numB){
        return Double.valueOf(numA) - Double.valueOf(numB);
    }
    
    public static double multiplicar(String numA,String numB){
        return Double.valueOf(numA) * Double.valueOf(numB);
    }
    
    public static double dividr(String numA,String numB){
        return Double.valueOf(numA) / Double.valueOf(numB);
    }
    
    
}
