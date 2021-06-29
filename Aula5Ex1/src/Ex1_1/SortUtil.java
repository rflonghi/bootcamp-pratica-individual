package Ex1_1;

public class SortUtil {

    public static <T extends Precedence> Precedence<T>[] sort (Precedence<T>[] arr) {
        Precedence<T> aux = null;
        int i = 0;

        for(i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length - 1; j++){
                if(arr[j].precedenceA((T) arr[j + 1]) > 0){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        return arr;
    }
}
