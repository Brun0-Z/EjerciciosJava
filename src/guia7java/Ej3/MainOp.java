package Ej3;

public class MainOp {

    public static void main(String[] args) {
        Operacion Op = new Operacion();
        Operacion Op1 = new Operacion(22, 24);
        System.out.println("La suma de los dos num es : " + Op1.suma());
        System.out.println("La resta de los num es : " + Op1.resta());
        System.out.println("La multiplicacion de los num es : " + Op1.multi());
        System.out.println("La division de los num es : " + Op1.div());
        Op.CrearOperacion();
        System.out.println("La suma de los dos num es : " + Op.suma());
        System.out.println("La resta de los num es : " + Op.resta());
        System.out.println("La multiplicacion de los num es : " + Op.multi());
        System.out.println("La division de los num es : " + Op.div());
        System.out.println("El num 1 de la Operacion1 " + Op1.getnum1());
        System.out.println("El num 2 de la Operacion1 " + Op1.getnum2());
        System.out.println("El num 1 de la Operacion1 " + Op.getnum1());
        System.out.println("El num 2 de la Operacion1 " + Op.getnum2());
        Op1.setnum1(10);
        Op1.setnum2(15);
        Op.setnum1(20);
        Op.setnum2(25);
        System.out.println("El num 1 de la Operacion1 " + Op1.getnum1());
        System.out.println("El num 2 de la Operacion1 " + Op1.getnum2());
        System.out.println("El num 1 de la Operacion1 " + Op.getnum1());
        System.out.println("El num 2 de la Operacion1 " + Op.getnum2());

    }

}


