
class student{
    String name;
    int age;
}



public class array {

    public static void main(String[] args) {
        

    // // 1D array--------------------------------------
        // int nums[] = new int[5];
        
        // for(int i = 0; i < nums.length; i++) {
        //     nums[i] = (int)(Math.random() * 100);
            
        // }   
        // for (int n : nums){
        //     System.out.print(n + " ");
            
        // }

    // 2D array--------------------------
        // int row  = 5;
        // int col = 5;
        // int nums[][] = new int[row][col];



        // for (int i = 0; i < row; i++) {
        
        //     for(int j = 0; j < col; j++) {
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }


        // for (int n[] :  nums) {
        //     for (int m : n){
        //         System.out.print(m + " ");
        //     }
        // System.out.println();
        // }


    // jagged array where number of columns are not equal to number of rows
    
        // int nums[][] = new int [3][];
        
        // nums[0] = new int[4];
        // nums[1] = new int[3];
        // nums[2] = new int[2];

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j <nums[i].length;j++){
        //         nums[i][j] = (int)(Math.random()*10);
        //     }
        // }

        // for (int n[] : nums){
        //     for (int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

    
    // Array of Objects
        student s1 = new student();
        s1.name = "Adesh";
        s1.age = 22;

        student s2 = new student();
        s2.name = "Navin";
        s2.age = 32;

        student s3 = new student();
        s3.name = "Cpt";
        s3.age = 34;
    
        student arr_of_obj[] = new student[3];

        arr_of_obj[0] = s1;
        arr_of_obj[1] = s2;
        arr_of_obj[2] = s3;

        // for (int i = 0; i < arr_of_obj.length; i++){
        //     System.out.println(arr_of_obj[i].name + " " + arr_of_obj[i].age);
        // }

        for(student stud : arr_of_obj){
            System.out.println(stud.name + " : "+ stud.age);
        }

    }
    
    
}
