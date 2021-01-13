package coursejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitieslist.Funcionario;

public class exe1list {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		
		System.out.println("How many employees will be regitred ? ");
		int N = sc.nextInt();
		
		for(int i =0; i<N ; i++) {
		System.out.print(" Inform the employee ID");
		int id = sc.nextInt();
		System.out.print(" Inform the employee name ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Inform the employee salary");
		double salary = sc.nextDouble();
		Funcionario funcionario = new Funcionario(id, name, salary);
		lista.add(funcionario);
		
		}
		System.out.println(lista);
		sc.close();

	}

}
