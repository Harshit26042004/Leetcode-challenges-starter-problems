import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

        public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {

            int index = -1;

            for(int i=A.size()-1;i>0;i--){
                if(A.get(i)>A.get(i-1)){
                    index = i-1;
                    break;
                }
            }

            if(index == -1){
                Collections.reverse(A);
                return A;
            }

            else{
                for(int i=A.size()-1;i>index;i--){
                    if(A.get(i)>A.get(index)){
                        int temp = A.get(i);
                        A.set(i,A.get(index));
                        A.set(index,temp);
                        break;
                    }
                }


                Collections.reverse(A.subList(index+1,A.size()));
                return A;
            }


        }


}
