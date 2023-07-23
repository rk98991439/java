public class ps6_1 {
    public static void main(String[] args) {
        System.out.println("calculating the sum of array.");
        float [] value = new float [5];
        value [0] = 1;       
        value [1] = 1;       
        value [2] = 1;       
        value [3] = 1.21f;       
        value [4] = 1;   
        float sum = 0;
        
        for (int i = 0; i < value.length; i++) 
        {
            sum = (sum + value[i]);
            System.out.println(value+" adding then the sum = "+ sum);
        }
    }
}
