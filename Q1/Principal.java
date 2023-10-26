
public class Principal {
	
	
	public Principal() {
		
	}
	
	
	public static void main(String[] args) {
		public static void main(String[] args) {
			Company companhia = new Company("Ford");
			Employee empregado = new Employee(companhia, "Afonso");
			Car carro = new Car("23","powershift");
			Truck scania = new Truck("Scania");
			
			System.out.println(empregado.name,"vende carros da marca", companhia.name , "e o modelo mais vendido é o  com cambio ",carro.gettransmission() );
		}
	}

}
