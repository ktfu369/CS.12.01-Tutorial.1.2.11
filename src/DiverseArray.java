public class DiverseArray {

    public static int arraySum(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    public static int[] rowSums(int[][] array){
        int[] rowSum = new int[array.length];
        for(int i=0;i<array.length;i++){
            rowSum[i] = arraySum(array[i]);
        }
        return rowSum;
    }

    public static boolean isDiverse(int[][] array){
        int[] rowSum = rowSums(array);
        for(int i=0;i<rowSum.length;i++){
            for(int j=i+1;j<rowSum.length;j++){
                if(rowSum[i] == rowSum[j]) return false;
            }
        }
        return true;
    }
}
