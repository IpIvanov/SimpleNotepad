package notepad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectronicSecuredNotepadDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of the notepad: ");
		System.lineSeparator();
		String name = br.readLine();
		System.out.print("Enter Number of pages: ");
		Integer pages = null;
		while (true) {
			try {
				pages = Integer.parseInt(br.readLine());
				if (pages == (int) pages && pages > 0) {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number bigger than 0");
			}
		}
		ElectronicSecuredNotepad notePadObject = new ElectronicSecuredNotepad(name, pages);
		notePadObject.startNotepad();
		while (true) {
			System.out.println("1. Add text to the page content.");
			System.out.println("2. Replace text from the page content.");
			System.out.println("3. Delete content from page.");
			System.out.println("4. Search for specific word");
			System.out.println("5. Print notepad content");
			System.out.println("6. Print notepad title");
			System.out.println("7. Print all pages with digits");
			System.out.println("8. Disable Notepad");
			System.out.println("9. Enable Notepad");
			System.out.println("0. EXIT");
			System.out.println("--------------------------------");
			if (!notePadObject.isStarted()) {
				System.out.println("Notepad is disabled!!!");
			}
			System.out.print("Your Choice: ");
			String choice = br.readLine();

			switch (choice) {
			case "1":
				if (!notePadObject.isStarted()) {
					break;
				}
				System.out.println("--------------------------------");
				System.out.print("Enter the content you want to add: ");
				System.lineSeparator();
				String addedContent = br.readLine();
				System.out.print("Enter the page you want to edit: ");
				System.lineSeparator();
				Integer pageNumber = null;
				while (true) {
					try {
						pageNumber = Integer.parseInt(br.readLine());
						notePadObject.addContentToPage(addedContent, pageNumber);
						if (pages == (int) pages && pages > 0) {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println("Please enter a number bigger than 0 and with range of the pages");
					}
				}
				System.out.println("--------------------------------");
				break;
			case "2":
				if (!notePadObject.isStarted()) {
					break;
				}
				System.out.println("--------------------------------");
				System.out.print("Enter the new content: ");
				System.lineSeparator();
				String newContent = br.readLine();
				System.out.print("Enter the page you want to edit: ");
				System.lineSeparator();
				Integer pageNumber2 = null;
				while (true) {
					try {
						pageNumber2 = Integer.parseInt(br.readLine());
						notePadObject.replaceContentToPage(newContent, pageNumber2);
						if (pages == (int) pages && pages > 0) {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println("Please enter a number bigger than 0 and with range of the pages");
					}
				}
				System.out.println("--------------------------------");
				break;
			case "3":
				if (!notePadObject.isStarted()) {
					break;
				}
				System.out.println("--------------------------------");
				System.out.print("Enter the page you want to delete: ");
				System.lineSeparator();
				Integer pageNumber3 = null;
				while (true) {
					try {
						pageNumber3 = Integer.parseInt(br.readLine());
						notePadObject.removeContentFromPage(pageNumber3);
						if (pages == (int) pages && pages > 0) {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println("Please enter a number bigger than 0 and with range of the pages");
					}
				}
				System.out.println("--------------------------------");
				break;
			case "4":
				if (!notePadObject.isStarted()) {
					break;
				}
				System.out.println("Search for word?");
				String word = br.readLine();
				notePadObject.searchWord(word);
				break;
			case "5":
				if (!notePadObject.isStarted()) {
					break;
				}
				notePadObject.printNotepad(notePadObject);
				break;
			case "6":
				if (!notePadObject.isStarted()) {
					break;
				}
				notePadObject.printNotePadName();
				break;
			case "7":
				if (!notePadObject.isStarted()) {
					break;
				}
				notePadObject.printAllPagesWithDigits();
				break;
			case "8":
				notePadObject.stopNotepad();
				break;
			case "9":
				notePadObject.startNotepad();
				break;
			case "0":
				System.out.println("Exit");
				return;
			default:
				System.out.println("Exit");
				return;
			}

		}
	}

}
