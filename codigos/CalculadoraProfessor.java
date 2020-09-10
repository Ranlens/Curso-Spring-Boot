public class CalculadoraProfessor {
    
    public static void main(String[]args){
        //indica se detalhaento do calculo deve ser apresentado na tela
        boolean calculoDetalhado = true;
        //constante do PI - http://pt.wikipedi.org/wiki/pi
        float pi = 3.14f;

        //raio - informado pelo professor
        float raio = 5.3f;

        //area é igual ao raio quadrado multiplicado por PI
        float area = raio * raio * pi;
        int areaSemCasasDecimais = (int) area;

        if (calculoDetalhado){
            System.out.println("Area = " + raio + " * " + pi);
        }

        System.out.println("resultado: " + area);
        System.out.println("resultado sem casas decimais: " + areaSemCasasDecimais);
        
    }
    
}
