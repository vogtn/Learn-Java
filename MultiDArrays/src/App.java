/**
 * Created by nicv on 5/6/17.
 */
public class App {
    public static void main(String[] args){
        //one dimensional array values[2]  <- one dimension
        int[] values = {3,5,2345};
        System.out.println(values[2]);

        //multi-dimensional array
        int[][] grid = {
                {3,5,2345},
                {2,4},
                {1,2,3,4}
        };

        //getting 4 from the second
        System.out.println(grid[1][1]);

        //create array first initialize later
        //2 dimensional array of references to strings 2 rows, 3 columns
        String[][] texts = new String[2][3];

        System.out.println(texts[0][1]);
        //will print out null

        texts[0][1] = "Hello there";

        System.out.println(texts[0][1]);
        //will print out "hello there"

        for(int row=0;row<grid.length;row++){
            for(int col=0; col<grid[row].length;col++){
                System.out.print(grid[row][col] + "\t");
            }
            //print each row in its own line
            System.out.println();
        }
    }
}
