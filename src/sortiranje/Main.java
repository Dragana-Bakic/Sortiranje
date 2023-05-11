package sortiranje;

public class Main {

	public static void main(String[] args) {

		int niz[] = { 5, 7, 1, 4, 6, 6, 9, 0, 2, 3, 8 };
		// int niza[] = { 5, 7, 1, 9};

		// Bubble Sort

		Bubble_Sort bs = new Bubble_Sort();
		System.out.println("Niz u opadajucem redosledu: - Bubble Sort -");

		bs.bubbleSort(niz);

		// Merge Sort

		Merge_Sort ms = new Merge_Sort();
		System.out.println("\nNiz u opadajucem redosledu: - Merge Sort -");

		ms.mergeSort(niz, 0, niz.length - 1);
		ms.printMergeSort(niz);

		// Selection Sort

		Selection_Sort ss = new Selection_Sort();
		System.out.println("\nNiz u opadajucem redosledu: - Selection Sort -");

		ss.selectionSort(niz);

		// Heap Sort

		Heap_Sort hs = new Heap_Sort();
		System.out.println("\nNiz u opadajucem redosledu: - Heap Sort -");

		hs.heapSort(niz);

		// Insertion Sort

		Insertion_Sort is = new Insertion_Sort();
		System.out.println("\nNiz u opadajucem redosledu: - Insertion Sort -");

		is.insertionSort(niz);

	}

}
