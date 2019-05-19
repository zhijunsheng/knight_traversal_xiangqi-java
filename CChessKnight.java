class CChessKnight {
  public static final void main(String[] args) {
    CChessBoard brd = new CChessBoard();
    System.out.println(brd);
  }
}

class CChessBoard {
  final static int rows = 10;
  final static int cols = 9;
  @Override
  public String toString() {
    String brdStr = "";
    brdStr += " ";
    for (int i = 0; i < cols; i++) {
      brdStr += " " + i;
    }
    brdStr += "\n";
    for (int row = 0; row < rows; row++) {
      brdStr += row + "";
      for (int col = 0; col < cols; col++) {
        brdStr += " .";
      }
      brdStr += "\n";
    }
    return brdStr;
  }
}
