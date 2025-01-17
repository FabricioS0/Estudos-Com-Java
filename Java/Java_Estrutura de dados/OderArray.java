class HighArray {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    //-----------------------------------------------------------
    public HighArray(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    //-----------------------------------------------------------
    public boolean find(long searchKey)
    { // find specified value
        int j;
        for(j=0; j<nElems; j++) // for each element,
            if(a[j] == searchKey) // found item?
                break; // exit loop before end
        if(j == nElems) // gone to end?
            return false; // yes, can’t find it
        else
            return true; // no, found it
    } // end find()

    //-----------------------------------------------------------
    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    //-----------------------------------------------------------
    public boolean delete(long value)
    {
        int j;
        for(j=0; j<nElems; j++) // look for it
            if( value == a[j] )
                break;
        if(j==nElems) // can’t find it
            return false;
        else // found it
        {
            for(int k=j; k<nElems; k++) // move higher ones down
                a[k] = a[k+1];
            nElems--; // decrement size
            return true;
        }
    } // end delete()

    
    public void display() // displays array contents
    {
        for(int j=0; j<nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    };

    
    public long getMax() {
        if (nElems == 0) 
            return -1; 
            long max = a[0];

            for (int i = 1; i < nElems; i++) { 
            if (a[i] > max) 
                max = a[i]; 
        }
        return max; 
    }
  

    public static void main(String[] args) {

        HighArray arr = new HighArray(60);; 
         
        arr.insert(69); 
        arr.insert(27);
        arr.insert(67);
        arr.insert(58);

        
        long max = arr.getMax();
            System.out.println("Valor maximo: " + max);

    }
}

public static long removeMax(long[] arr, int maxIndex, int nElems) {
    long removedMax = arr[maxIndex];
    for (int k = maxIndex; k < nElems - 1; k++) 
        arr[k] = arr[k + 1];
    return removedMax;
}


class HighArrayApp{
    Run | Debug
    public static void main(String[] args) {
        HighArray arr = new HighArray (5);
        arr.insert(8);
        arr.insert(25);
        HighArray outroArr = new HighArray (5);
        
        while (arr.getMax() != -1) {
            long max = arr.getMax();
            arr.delete(max);
            outroArr.insert(max);
        }
        System.out.println(x: "Matriz classificada em ordem decrescente:");
        for (int i = 0; i < outroArr.getnElems(); i++) {
                System.out.println(outroArr.getA()[i]);
        }
    }
}
