/**
 * La clase CCuenta representa una cuenta bancaria con operaciones como ingreso y retiro.
 * Proporciona métodos para gestionar el estado de la cuenta y realizar operaciones financieras.
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Contructor vacío
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros de la clase CCuenta.
     *
     * @param nom      Nombre del titular de la cuenta.
     * @param cue      Número de cuenta.
     * @param sal      Saldo inicial de la cuenta.
     * @param tipo     Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * devuelve el titular de la cuenta
     * @return el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     * @param nombre, el nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtenemos la cuenta
     * @return devuelve la cuenta bancaria
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * establece la cuenta bancaria
     * @param cuenta, la cuenta bancaria
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *obtenemos el saldo
     * @return devuelve el saldo actual de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * establece el saldo de la cuenta
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * obtenemos el tipo de interés
     * @return El tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * establecemos el tipo de interés
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * obtenemos el saldo actual de la cuenta
     * @return saldo actual
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Realizamos una operacion de ingreso
     * @param cantidad la cantidad a ingresar
     * @throws Exception da fallo  si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realizamos una operacion de retirada de dinero
     * @param cantidad la cantidad a retirar
     * @throws Exception da fallo si no hay tanto saldo como queremos retirar.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Realizamos pruebas en una cuenta especifica
     * @param cantidad
     */
    public void operativaCuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

