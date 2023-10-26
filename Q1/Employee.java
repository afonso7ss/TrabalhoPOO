
import java.util.ArrayList;

public class Employee {
	private ArrayList <Automovel> automoveis;
	private Company companhia;
	private String name;
	

	public Employee(Company companhia, String name, ArrayList <Automovel> automovel){
		this.automoveis = automovel;
		this.companhia = companhia;
		this.name = name;
	}
}
