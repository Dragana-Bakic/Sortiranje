package sortiranje;

public class Heap_Sort {

	void heap(int niz[], int n, int i) {
		// n - velicina gomile
		// i - index u nizu

		int min = i; // inicijalizacija elementa kao najveceg
		int x = i + 1;
		int y = i + 2;

		if (x < n && niz[x] < niz[min])
			min = x;

		if (y < n && niz[y] < niz[min])
			min = y;

		if (min != i) {
			int zamena = niz[i];
			niz[i] = niz[min];
			niz[min] = zamena;

			heap(niz, n, min);
		}
	}

	public void heapSort(int niz[]) {

		int n = niz.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heap(niz, n, i);

		for (int i = n - 1; i > 0; i--) {
			int zamena = niz[0];
			niz[0] = niz[i];
			niz[i] = zamena;

			heap(niz, i, 0);
		}

		for (int i = 0; i < n; ++i)
			System.out.print(niz[i] + " ");
		System.out.println();
	}

}
