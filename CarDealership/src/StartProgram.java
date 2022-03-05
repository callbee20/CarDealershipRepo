

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


import controller.VehicleModelHelper;
import model.VehicleModel;

public class StartProgram {

		static Scanner in = new Scanner(System.in);
		static VehicleModelHelper vmh = new VehicleModelHelper();

		private static void addAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter a model ex.(fusion): ");
			String model = in.nextLine();
			System.out.print("Enter an make ex.(ford): ");
			String make = in.nextLine();
			System.out.println("Enter a drive train ex.(4wd): ");
			String driveTrain = in.nextLine();
			System.out.println("Enter a price for the vehicle: ");
			double price = in.nextDouble();
			LocalDate addedToLot = LocalDate.now();

			VehicleModel toAdd = new VehicleModel(model, make, driveTrain, price, addedToLot);
			vmh.addModel(toAdd);
		}

		private static void deleteAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter a model ex.(fusion): ");
			String model = in.nextLine();
			System.out.print("Enter an make ex.(ford): ");
			String make = in.nextLine();
			System.out.println("Enter a drive train ex.(4wd): ");
			String driveTrain = in.nextLine();
			System.out.println("Enter a price for the vehicle: ");
			double price = in.nextDouble();
			LocalDate addedToLot = LocalDate.now();
			
			VehicleModel toDelete = new VehicleModel(model, make, driveTrain, price, addedToLot);
			vmh.deleteVehicle(toDelete);

		}

		private static void editAnItem() {
			// TODO Auto-generated method stub
			System.out.println("How would you like to search? ");
			System.out.println("1 : Search by Model");
			System.out.println("2 : Search by Make");
			int searchBy = in.nextInt();
			in.nextLine();
			List<VehicleModel> foundItems;
			if (searchBy == 1) {
				System.out.print("Enter the model name: ");
				String model = in.nextLine();
				foundItems = vmh.searchForVehicleByModel(model);
				
			} else {
				System.out.print("Enter the make: ");
				String make = in.nextLine();
				foundItems = vmh.searchForVehicleByMake(make);
				

			}

			if (!foundItems.isEmpty()) {
				System.out.println("Found Results.");
				for (VehicleModel l : foundItems) {
					System.out.println(l.getId() + " : " + l.toString());
				}
				System.out.print("Which ID to edit: ");
				int idToEdit = in.nextInt();

				VehicleModel toEdit = vmh.searchForVehicleById(idToEdit);
				System.out.println("Retrieved " + toEdit.getId() + " from " + toEdit.getMake());
				System.out.println("1 : Update Make");
				System.out.println("2 : Update Model");
				int update = in.nextInt();
				in.nextLine();

				if (update == 1) {
					System.out.print("New Make: ");
					String newMake = in.nextLine();
					toEdit.setMake(newMake);
				} else if (update == 2) {
					System.out.print("New Item: ");
					String newModel = in.nextLine();
					toEdit.setModel(newModel);
				}

				vmh.updateVehicle(toEdit);

			} else {
				System.out.println("---- No results found");
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			runMenu();

		}

		public static void runMenu() {
			boolean goAgain = true;
			System.out.println("--- Welcome to our awesome shopping list! ---");
			while (goAgain) {
				System.out.println("*  Select an item:");
				System.out.println("*  1 -- Add an item");
				System.out.println("*  2 -- Edit an item");
				System.out.println("*  3 -- Delete an item");
				System.out.println("*  4 -- View the list");
				System.out.println("*  5 -- Exit the awesome program");
				System.out.print("*  Your selection: ");
				int selection = in.nextInt();
				in.nextLine();

				if (selection == 1) {
					addAnItem();
				} else if (selection == 2) {
					editAnItem();
				} else if (selection == 3) {
					deleteAnItem();
				} else if (selection == 4) {
					viewTheList();
				} else {
					vmh.cleanUp();
					System.out.println("   Goodbye!   ");
					goAgain = false;
				}

			}

		}

		private static void viewTheList() {
			// TODO Auto-generated method stub
			List<VehicleModel> allVehicles = vmh.showAllVehicles();
			
			for (VehicleModel singleItem: allVehicles) {
				System.out.println(singleItem.toString());
			}

		}

	}
