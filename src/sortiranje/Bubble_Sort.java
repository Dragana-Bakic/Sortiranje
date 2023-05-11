package sortiranje;

public class Bubble_Sort {

	// najjednostavniji algoritam za sortiranje elemenata niza
	// radi na način da iznova vrši zamenu susednih elemenata ukoliko su u pogrešnom
	// redosledu (kreće poređenjem prva dva elementa)
	// nije pogodan za veće podatke, zbog složenosti/vremena izvodjenja

	public void bubbleSort(int niz[]) {

		// sortiranje u opadajucem redosledu
		int x = niz.length;
		int brojZamena = 0;
		int brojProlazaka = 0;
		for (int i = 0; i < x - 1; i++) {
			brojProlazaka++;
			for (int j = 0; j < x - i - 1; j++) {
				brojProlazaka++;
				if (niz[j] < niz[j + 1]) {
					int zamena = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = zamena;
					brojZamena++;
				}
			}
		}

		// stampanje niza
		for (int i = 0; i < x; ++i) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
		System.out.println("Broj zamena: " + brojZamena + "\nBroj provera: " + brojProlazaka);
	}

}
