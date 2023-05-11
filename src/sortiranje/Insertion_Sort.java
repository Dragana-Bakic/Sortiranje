package sortiranje;

public class Insertion_Sort {

	// niz podeli u sortiran i nesortiran, vrednosti iz nesortiranog dela izvlaci i
	// smesta u odgovarajucu poziciju u sortiranom delu

	public void insertionSort(int niz[]) {

		int n = niz.length;
		for (int i = 1; i < n; ++i) {
			int x = niz[i];
			int y = i - 1;

			// Pomeranje elemenata niza koji su manji od elementa x jednu poziciju ispred
			// njihove trenutne

			while (y >= 0 && niz[y] < x) {
				niz[y + 1] = niz[y];
				y = y - 1;
			}
			niz[y + 1] = x;
		}

		for (int i = 0; i < n; ++i)
			System.out.print(niz[i] + " ");

		System.out.println();
	}

}