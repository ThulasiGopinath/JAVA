import java.util.Arrays;
class longestprefix {
public static void main(String[] args) {
    String[] arr = {"camp","camu","camera","campus"};
    Arrays.sort(arr);
    String first = arr[0];
    String last = arr[arr.length-1];
    System.out.println(first);
    System.out.println(last);
    int index = -1;
    for(int i=0;i<Math.min(last.length(), first.length()); i++){
        if(last.charAt(i)!=first.charAt(i)) {
        break;
        }
        index = i;
    }
    if(index==-1){
        System.out.println("");
    }else{
    System.out.println(index);
    }
}
}