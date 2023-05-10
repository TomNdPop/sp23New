import java.util.List;
import java.util.ArrayList;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int total = 0;
        for(Integer elem : L){
            total += elem;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenCommon = new ArrayList<Integer>();
        for(Integer elem : L){
            if(elem%2 ==0){
                evenCommon.add(elem);
            }
            else
                continue;
        }
        return evenCommon;
        return null;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        return null;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        return 0;
    }
}
