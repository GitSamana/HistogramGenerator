/* CODE DESCRIPTION:
 * Histogram is an instantiable class. It asks the user to input data and
 * creates a histogram to represent the data.
 * It consists of a zero parameter constructor that builds the skeleton of 
 * the histogram.
 * It sets the borders for the histogram by adding characters to the 
 * 2 dimensional array. 
 * It also fills in the number of each grade in the array.
 * These values are received from the user by prompts using JOptionPane
 * The class also consists of a toString method that creates a string
 * representation of the two dimensional array.
 * 
 * The string is printed out in the main method to the console.
 * 
 */


import javax.swing.*; //import statement

public class Histogram { //class declaration statement
  
  public static String r, c; //number of rows and columns entered as string
  public static int row, col; //number of rows and columns as ints
  public static Character [][] histo;//2D array to hold symbols of histogram 
  public static String ga, gb, gc, gd, gf; // no. of each grade as strings
  public static int gaa, gbb, gcc, gdd, gff; // no. of each grade as ints
  
  
  public Histogram(){ // constructor for class histogram
    

    for (int i = 0; i < histo.length; i++) {        
      // for all rows
      for (int j = 0; j < histo[i].length; j++) { 
        // for each column in row i
        histo[i][j] = ' ';  // set position [i][j] to a space                 
      }
    }
     
    for (int i = 0; i < histo.length; i++){
      //set left-most column to |'s
      histo[i][0] = '|';
    }
    
    for (int i = 0; i < histo.length; i++){
      //set right-most column to |'s
      histo[i][histo[i].length-1] = '|';
    }
    
    for (int j = 0; j < histo[0].length - 1; j++){
      //set bottom row to _'s
      histo[histo.length - 1][j] = '_';
    }
    
    for (int j = 1; j < histo[0].length - 1; j++){
      // set top row to ^'s
      histo[0][j] = '^';
    }
    
    for (int j = 1; j < histo[0].length - 1; j++){
      // set second row to ~'s
      histo[1][j] = '~';
    }
    
    // set bottom right and left corners to +'s
    histo[histo.length - 1][0] = '+';
    histo[histo.length - 1][histo[1].length-1] = '+';
    
    
    // for loop to set every 3rd column to a letter grade
    for (int j = 3; j < histo[0].length; j += 3){
      // switch statement to set the bottom row to A,B,C,D,F in order
      switch (j) {//switch depending on value of j (column number)
        case 3: // 3rd column
          // set the 3rd column of the bottom row to A
          histo[histo.length - 1][j] = 'A';
          // fill in the 3rd column with gaa number of *'s
          for (int i = histo.length - 2; i > ((histo.length - 2) - gaa); i--){
            histo[i][j] = '*';
          }
          break;//break out of switch case into the for loop again
          
        case 6: // 6th column
          // set the 6th column of the bottom row to B
          histo[histo.length - 1][j] = 'B';
          // fill in the 6th column with gbb number of *'s
          for (int i = histo.length - 2; i > ((histo.length - 2) - gbb); i --){
            histo[i][j] = '*';
          }
          break;//break out of switch case into the for loop again
          
        case 9: // 9th column
          // set the 9th column of the bottom row to C
          histo[histo.length - 1][j] = 'C';
          // fill in the 9th column with gcc number of *'s
          for (int i = histo.length - 2; i > ((histo.length - 2) - gcc); i --){
            histo[i][j] = '*';
          }
          break;//break out of switch case into the for loop again
          
        case 12: // 12th column
          // set the 12th column of the bottom row to D
          histo[histo.length - 1][j] = 'D';
          // fill in the 12th column with gdd number of *'s
          for (int i = histo.length - 2; i > ((histo.length - 2) - gdd); i --){
            histo[i][j] = '*';
          }
          break;//break out of switch case into the for loop again
          
        case 15: // 15th column
          // set the 15th column of the bottom row to F
          histo[histo.length - 1][j] = 'F';
          // fill in the 15th column with gff number of *'s
          for (int i = histo.length - 2; i > ((histo.length - 2) - gff); i --){
            histo[i][j] = '*';
          }
          break;//break out of switch case into the for loop again
      }// end of switch statement
    }// end of for loop  
  }// end of constructor
  
  
  // main method
  public static void main (String[] args){
    
    //welcome message
    JOptionPane.showMessageDialog
      (null, "Hi! Welcome to Histogram generator!\n"
         +"I just need some info about your data and then your histogram\n"
         +"will be ready in no time!");
    
    
    //prompt to get number of columns  
    c = JOptionPane.showInputDialog
      ("How many different types of grades are in your data?");
    
    
    //prompt to get number of rows
    r = JOptionPane.showInputDialog
      ("What is the largest number of people who received a certain grade");
    
    //converting input string values to int
    row = Integer.parseInt(r); // number of rows
    col = Integer.parseInt(c); // number of columns
    
    // setting dimensions of array to the input values
    Histogram.histo = new Character [row + 4][(col * 4)-1];
    
    
    //prompt to get number of each grade
    ga = JOptionPane.showInputDialog
      ("How many people got an 'A'?");
    
    gb = JOptionPane.showInputDialog
      ("How many people got a 'B'?");
    
    gc = JOptionPane.showInputDialog
      ("How many people got a 'C'?");
    
    gd = JOptionPane.showInputDialog
      ("How many people got an 'D'?");
    
    gf = JOptionPane.showInputDialog
      ("How many people got an 'F'?");
    
    //Informing the user that their histogram will appear in the console
    JOptionPane.showMessageDialog
      (null, "Check the console!");
    
    
    // parsing input strings for number of each grade into ints
    gaa = Integer.parseInt(ga);
    gbb = Integer.parseInt(gb);
    gcc = Integer.parseInt(gc);
    gdd = Integer.parseInt(gd);
    gff = Integer.parseInt(gf);
    
    // creating a new Histogram object
    Histogram graph = new Histogram();
    
    // printing out the string representation of the histogram array in graph
    System.out.println("              Samana just made you a");
    System.out.println();
    System.out.println
      ("              *  *  ***  ***  ***  **    **   ***     **   *   *  *");
    System.out.println
      ("              *  *   *  *      *  *  *  *     *  *   *  *  ** **  *");
    System.out.println
      ("              ****   *   ***   *  *  *  *     * *    ****  * * *  *");
    System.out.println
      ("              *  *   *      *  *  *  *  * **  *  *   *  *  *   *  *");
    System.out.println
      ("              *  *  ***  ***   *   **    **   *   *  *  *  *   *  o");
    System.out.println();
    System.out.println("                               "+ graph.tString());
    
    // call to exit the program.
    System.exit(0);
  }// end of main  method
  
  
  //method to create string representation of array 
  public static String tString(){
    // empty string to hold the strng representation of array
    String ret = "";
    
    // for loop to go through each row
    for (int i = 0; i < histo.length; i++){
      //nested for loop to go through each column
      for (int j = 0; j < histo[0].length; j++){
        //call toString method recursively on histo and appending it to 
        //return string 
        ret += histo[i][j].toString();
      }// end inner for loop
      ret += "\n";//add a new line at end of each row
      // add some blank spaces to print the string at the center of screen
      ret += "                               ";
    }//end of outer for loop
    return ret;//return the string holding the contents of the array.
  }// end of tString 
}//end of class Histogram

