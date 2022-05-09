public class Area {
    public static void calcularArea (float ladoQuadrado) {
        float valorArea = ladoQuadrado * ladoQuadrado;
        System.out.println("O valor da área do quadrado é de: " + valorArea);
    }
    public static void calcularArea(float ladoRetangulo, float alturaRetangulo) {
        float valorArea = ladoRetangulo * alturaRetangulo;
        System.out.println("O valor da área do retângulo é de: " + valorArea);
        
    }
    public static void calcularArea(float baseTriangulo, float alturaTriangulo, int triangulo) {
        float valorArea = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("O valor da área do triângulo é de: " + valorArea);
        
    }
}