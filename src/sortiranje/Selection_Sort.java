package sortiranje;

public class Selection_Sort {

	// radi na način da poredeci elemente u delu niza koji nije sortiran smesta ga
	// na odgovarajucu poziciju u sortiran deo. Ovaj proces se ponavlja na
	// nesortiran deo liste sve dok se cela lista ne sortira.
	// (Selektuje min/max element u nizu i smesta ga u sortiran deo, i u ostatku
	// nesortiranog niza selektuje sledeci min/max element i zamenjuje ga sa prvim
	// elementom nesortirane liste sve dok se svi elementi ne sortiraju)

	public void selectionSort(int niz[]) {

		int n = niz.length;

		for (int i = 0; i < n - 1; i++) {
			// Pronalazenje elementa sa najvecom vrednoscu u nesortiranom nizu
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (niz[j] > niz[min]) {
					min = j;
					// zamena max elementa sa prvim elementom
					int zamena = niz[min];
					niz[min] = niz[i];
					niz[i] = zamena;
				}
			}
		}

		for (int i = 0; i < n; ++i) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}

}
