public class ps6_3 {
    public static void main(String[] args) 
    {
        System.out.println("2d array");
        String [][] matrix = new String [5][2];
        matrix [0][0]= "Student_name";
        matrix [1][0]= "rohit";
        matrix [2][0]= "frod";
        matrix [3][0]= "ayush";
        matrix [4][0]= "rick";
        matrix [0][1]= "student_marks";
        matrix [1][1]= "23";
        matrix [2][1]= "56";
        matrix [3][1]= "10";
        matrix [4][1]= "22";

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
   
        }


        System.out.println("array sum ");
        int [] matrix1 = new int [5];
        int sum = 0;
        matrix1 [1]= 23;
        matrix1 [2]= 56;
        matrix1 [3]= 10;
        matrix1 [4]= 22;

        for (int i = 0; i < matrix1.length; i++) 
        {
            sum = sum + matrix1[i];
                System.out.println(matrix1[i]+ " = "+sum);
                System.out.println("avg = "+(sum/((matrix1.length)+1))+"\n");
        }


    }
}
