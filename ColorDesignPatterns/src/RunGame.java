import java.util.Scanner;

public class RunGame {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    PlayGame obj = new PlayGame();
    Scanner s = new Scanner(System. in );
    String cmnd;
    while (true) {
      cmnd = s.next();
      obj.getCommmands(cmnd);

    }
  }
}
