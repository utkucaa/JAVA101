public class TekrarEdenCiftSayilar {

    public static boolean isFind(int[] arr,int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {2,5,89,2,32,7,0,32,5,0,0,0,4,32};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i=0 ; i < list.length ; i++){

            if((list[i] % 2 == 0)){
                if(!isFind(duplicate,list[i])){
                    duplicate[startIndex++] = list[i];
                }
            }
        }

        for(int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }

        }

    }

