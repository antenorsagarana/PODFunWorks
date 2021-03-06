/**
 * Created by Antenor on 26/02/2015.
 */
public class InsertionSort extends Sorts {

    public InsertionSort(int[] myArray){
        this.myArray = myArray;
//        showArray(myArray);
        doInsertionSort();
//        showArray(myArray);
    }

    public void doInsertionSort() {
        diffTime = System.currentTimeMillis();
        for(int i=0;i<myArray.length;i++){
            int previousIndex = i - 1;
            int index = i;
            if(i != 0){
                while(previousIndex >= 0){
                    if(shouldTradeValues(myArray[index], myArray[previousIndex])){
                        tradeValues(previousIndex);
                        index--;
                    }
                    previousIndex--;
                }
            }
        }
        showDiffTime(diffTime, "InsertionSort");
    }

    private boolean shouldTradeValues(int value, int previousValue) {
        return value < previousValue;
    }

    private void tradeValues(int i) {
        int aux;
        aux = myArray[i+1];
        myArray[i+1] = myArray[i];
        myArray[i] = aux;
    }
}
