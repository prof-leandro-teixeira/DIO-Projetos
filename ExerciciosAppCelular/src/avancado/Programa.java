package avancado;

public class Programa {
	
	public abstract class Funcionario {
		private double salario;
		
		public double getSalario() {
			return this.salario;
		}
		
		public static void main(String[] args) {
		
			Funcionario func = new Vendedor();
			func.salario = 500;
			
			System.out.println(func.getSalario());
			}
		
public abstract class Vendedor extends Funcionario{
	private double salario;
	
	public double getSalario() {
		return super.getSalario();
	}
}}}
