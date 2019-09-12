package com.task.sorters.methods;

public class BubbleSort extends SortPoint {
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        if (this.array == null) {
            throw new NullPointerException();
        } else {
            System.out.println("BubbleSort");
            for (int i = 0; i < this.array.length - 1; i++) {
                for (int j = 0; j < this.array.length - i - 1; j++) {
                    if (this.array[j] > this.array[j + 1])
                        swap(j, j + 1);
                }
            }
        }

    }
}
