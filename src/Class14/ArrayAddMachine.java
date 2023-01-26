package Class14;

public class ArrayAddMachine {
    public static void main(String[] args) {

      int [] arr2={10,10,10,20,30};
      addArrayElementMachine(arr2);
      int [] arr3={20,30,40,40};
      addArrayElementMachine(arr3);

    }

    static void addArrayElementMachine(int [] arr){
        int sum=0;
                for(int number:arr){
                    sum+=number;
                }
        System.out.println(sum);
    }
}
