/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TarefaCorrida;

public class App {

    public static void main(String[] args) {
        Veiculo fusca = new Veiculo (new MotorFusca());
        Veiculo celta = new Veiculo (new MotorCelta());
        Veiculo ferrari = new Veiculo (new MotorFerrari());
        Veiculo lambo = new Veiculo (new MotorLambo());
        
        System.out.println (fusca.acelerar());
        System.out.println (celta.acelerar());
        System.out.println (ferrari.acelerar());
        System.out.println (lambo.acelerar());
        
    }
}
