public class Main {

   public static void main(String []args) {
      
      // *** 2D ARRAY DATA STRUCTURE ***
      // like an Array, but a GRID with
      // ROWS (horizontal) & COLUMNS (vertical)

      // DECLARE a 2D array with double square brackets
      int[][] experimentData; // null (empty)
      double[][] pointValues;

      // CREATE/INITIALIZE a 2D array, call constructor
      experimentData = new int[10][3]; // 10 rows, 3 columns

      // INITIALIZE a 2D array (declare + create)
      String[][] seatingChart = new String[4][6];
      // total number of items? 4 * 6 = 24
      
      // SET A VALUE by accessing a cell
      // ACCESS a call: arrayName[row][col]
      seatingChart[0][0] = "Mia";
      seatingChart[0][5] = "Sohaila";
      // 6 cols --> but 5 is FINAL INDEX!!!
      seatingChart[1][0] = "Ethan";
      seatingChart[1][5] = "Zach";
      seatingChart[2][1] = "Aaniyah";
      seatingChart[2][3] = "Simeon";
      seatingChart[2][4] = "Bowe"; // second to last col
      seatingChart[3][0] = "MaxS";


      // Shortcut: INITIALIZER LISRS
      // use double curly bracket to set values
      // for a 2D array right away!
      String [][] bingo = {
                           {"!", "A", "11"} , 
                           {"$", "❤️", ":)"} ,
                           {"," , "20", "x"} 
                           };
      // Look at new array
      System.out.println(bingo); // no built-in toString
      // have to use a loop for access individual items
      System.out.println( bingo [0][0] );
       System.out.println( bingo [1][1] );
        System.out.println( bingo [1][2] );

      // array.length provides # of ROWS in a 2D array
      int numRows = seatingChart.length; // 4
      // array[0].length provides # of COLS
      int numCols = seatingChart[0].length;
      // seatingChart[0] is literally the whole first row

      // use this info in the standard for loop
      for (int r = 0; r < seatingChart.length; r++) {
         for (int c = 0; c < seatingChart[0].length; c++) {
            // can modify values in a standard for loop!
            seatingChart[r][c] = "🪑" + seatingChart[r][c];
            System.out.print ( seatingChart[r][c] + " " ); // current cell
         }
         System.out.println(); // new line every row
      }


   }
}
