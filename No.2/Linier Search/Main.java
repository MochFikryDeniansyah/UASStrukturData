public class Main {
    public static void main(String[] args) {
        int[] intArray = {11,35,-5,14,66,3,-33,20,10,-25,27,6,30,-89};

        //System.out.println(linierSearch(intArray, -99));

        if(liniearSearch(intArray,20) == -1){
            System.out.println("Data tidak ditemukan");
        } else{
            System.out.println("Data ditemukan pada index ke " + liniearSearch(intArray, 20));
        }

    }

    public static int liniearSearch(int[] input, int value){
        for(int i=0; i < input.length; i++){
            if(input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
