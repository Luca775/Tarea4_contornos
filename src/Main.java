public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        //Llamamos al método operativaCuenta para realizar las operaciones
        cuenta1.operativaCuenta(100);


    }
}

