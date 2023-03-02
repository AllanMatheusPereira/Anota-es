Anotações
Conteúdo sobre GIT para estudar
 https://www.youtube.com/watch?v=cv82YD3OZEU
 https://github.com/DanielHe4rt/git4noobs

Como calcular a área em Java?
nextFloat(); area = scan. nextFloat(); area = PI* (raio*raio); System. out. print("O valor da area é " + area); System.


Triangulo em JAVA:
Dia 02/03/2023

public static void main(String[] args) {
    /*Descubra a área do que o usuário passar
     * Trapézio: A = ((B + b)/2) * h
     * B = Base maior, b = base menor, h = altura
     * 
     * Triângulo: A = (B*h)/2
     * B = Base, h = altura
     */


    System.out.println("Bem-vindo ao calculador de área!");
    System.out.println("Informe qual objeto quer calcular: ");

    Scanner input = new Scanner(System.in);

    boolean trapézio = true, triângulo = true;

    if(trapézio){
        Double B,b,h,A;
        //coletando os valores do usuário
        System.out.println("Informe o valor de B = base maior: ");
        B = input.nextDouble();
        System.out.println("Informe o valor de b = base menor: ");
        b = input.nextDouble();
        System.out.println("Informe o valor de h = altura");
        h = input.nextDouble();
        //calculando
        A = ((B + b)/2)*h;
        System.out.println("O valor dado é B: "+B+" b: "+b+" h: "+h);
        System.out.println("A área do trapézio é: "+A);
        input.close();
    }
    if(triângulo){
        Double B,h,A;
        //coletando valores do usuário
        System.out.println("Informe o valor de B = base: ");
        B = input.nextDouble();
        System.out.println("Informe o valor de h = altura: ");
        h = input.nextDouble();
        //calculando
        A = (B*h)/2;
        System.out.println("O valor dado é B: "+B+" h: "+h);
        System.out.println("A área do triângulo é: "+A);
        input.close();
    }   


}
}