public class Atividade {
    public static void main(String[] args) {
        int[] arr = new arr[n];



        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int j = n - i - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}

public long median() {
        insertionSort(); 
        int middle = nElems / 2;
        if (nElems % 2 == 0) {
            
            return (a[middle - 1] + a[middle]) / 2;
        } else {

            return a[middle];
        }
    }



public void noDups() {
    int newSize = 0; 
    for (int i = 0; i < nElems; i++) {
        if (a[i] != a[i + 1]) {
            a[newSize] = a[i]; 
             newSize++; 
        }
    }

    nElems = newSize; 
}



public void insertionSort() {
    int in, out;
    for (out = 1; out < nElems; out++) {
        long temp = a[out];
        in = out;
        while (in > 0) {
            comparisons++; 
            if (a[in - 1] >= temp) {
                a[in] = a[in - 1];
                copies++; 
                --in;
            } else {
                break;
            }
        }
        a[in] = temp;
    }
}