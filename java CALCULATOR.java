import java.util.Scanner;

class apples{
  public static void main(String args[]){
    Scanner bucky = new Scanner(System.in);
    double fnum, snum, answer;
    System.out.prinln("Enter first num: ");
    fnum = bucky.nextDouble();
    System.out.prinln("Enter second num: ");
    snum = bucky.nextDouble();
    answer = fnum + snum;
    System.out.println(answer);

  }
}
