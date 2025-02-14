package application;

import java.util.Scanner;

import entities.Room;

public class Program_pensionato {

	public static void main(String[] args) {
		// pensionato - desafio 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.print("\n");
		
		Room[] quartos = new Room[10];
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Rent #"+(i+1));
			
			System.out.print("Name: ");
			sc.nextLine();
			
			String name = sc.nextLine();
			System.out.print("Email: ");
			
			String email = sc.nextLine();
			System.out.print("Room: ");
			int opt = sc.nextInt();
			
			System.out.print("\n");
			
			int q = opt-1;
			
			quartos[q] = new Room(name,email);
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println((i+1)+": "+quartos[i].getName()+", "+quartos[i].getEmail());
			}
		}
		
		
		
		sc.close();
		

	}

}
