import java.util.*;

public class Sorting {
    ArrayList<Integer> list = new ArrayList<>();
    Sorting(ArrayList<Integer> arr){
        this.list = arr;
    }

    void selectionSort(){
        int n = list.size();
        for(int i=0;i<n-1;i++){

            int in = i;
            for(int j=i+1;j<n;j++){
                if(list.get(in)>list.get(j)){
                    in = j;
                }
            }
            int temp = list.get(i);
            list.set(i,list.get(in));
            list.set(in,temp);

        }
        System.out.println(list);
    }

    void bubbleSort(){
        int n = list.size();
        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        System.out.println(list);
    }

    void insertionSort(){
        int n = list.size();

        for(int i=1;i<n;i++){
            int key = list.get(i);
            int j = i-1;

            while(j>=0 && list.get(j)>key){
                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,key);
        }
        System.out.println(list);
    }

    static void merge(ArrayList<Integer> arr,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> t = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr.get(left)<=arr.get(right)){
                t.add(arr.get(left));
                left++;
            }
            else{
                t.add(arr.get(right));
                right++;
            }
        }
        while(left<=mid){
            t.add(arr.get(left));
            left++;
        }
        while(right<=high){
            t.add(arr.get(right));
            right++;
        }
        for(int i=low;i<=high;i++){
            arr.set(i,t.get(i-low));
        }
    }

    static void mergeSort(ArrayList<Integer> arr,int low,int high){
        if(high<=low){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(List.of(2,3,1,6,4,9,5));

        Sorting s = new Sorting(arr);

        int h = arr.size()-1;
        mergeSort(arr,0,h);
        System.out.println(arr);


    }
}
