package sortiranje;

public class Merge_Sort {

	// radi na nacin da niz podeli u manje "podnizove" koje sortira i onda ih spaja
	// ovaj proces ponavlja dok se ceo niz ne sortira - rekurzivni algoritam koji
	// kontinuirano deli niz na pola sve dok se ne moze dalje podeliti (jedan
	// element ostaje), i spaja u odgovarajucem redosledu, sortirane podnizove
	// kombinuje i pravi sortirani niz
	// prednosti su sto relativno brzo sortira velike nizove, redosled elemenata sa
	// istim vrednostima ostaje isti tokom sortiranja
	// efikasan i jednostavan za implementiranje

	public void merge(int niz[], int x, int pola, int n) {

		// metoda za spajanje

		// Prvi niz: x...pola
		// Drugi niz: pola+1....n

		// Pronalazenje velicine podnizova koji se spajaju
		int l1 = pola - x + 1;
		int l2 = n - pola;

		// Kreiranje privremenih nizova
		int A[] = new int[l1];
		int B[] = new int[l2];

		// Prebacivanje elemenata niza u podnizove
		for (int i = 0; i < l1; ++i)
			A[i] = niz[x + i];
		for (int j = 0; j < l2; ++j)
			B[j] = niz[pola + 1 + j];

		// Spajanje privremenih nizova

		int i = 0, j = 0; // inicijalni indeksi prvog i drugog podniza

		int im = x; // inicijalni indeks spojenog niza
		while (i < l1 && j < l2) {
			if (A[i] >= B[j]) {
				niz[im] = A[i];
				i++;
			} else {
				niz[im] = B[j];
				j++;
			}
			im++;
		}

		while (i < l1) { // Prebacivanje preostalih elemenata niza (ukoliko ima)
			niz[im] = A[i];
			i++;
			im++;
		}

		while (j < l2) { // Prebacivanje preostalih elemenata niza (ukoliko ima)
			niz[im] = B[j];
			j++;
			im++;
		}
	}

	public void mergeSort(int niz[], int x, int n) {

		// metoda za sortiranje koristeci metodu merge

		if (x < n) {
			// Pronalazenje polovine niza
			int pola = x + (n - x) / 2;

			// Sortiranje prve i druge polovine niza
			mergeSort(niz, x, pola);
			mergeSort(niz, pola + 1, n);

			// Spajanje sortiranih podnizova
			merge(niz, x, pola, n);
		}
	}

	public void printMergeSort(int niz[]) {

		// Metoda za stampanje sortiranog niza

		int l = niz.length;
		for (int i = 0; i < l; ++i) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}
}
