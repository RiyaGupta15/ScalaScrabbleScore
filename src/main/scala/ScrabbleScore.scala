object ScrabbleScore {
  val values = Map (
    1 -> Set('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'),
    2 -> Set('D', 'G'),
    3 -> Set('B', 'C', 'M', 'P'),
    4 -> Set('F', 'H', 'V', 'W', 'Y'),
    5 -> Set('K'),
    8 -> Set('J', 'X'),
    10 -> Set('Q', 'Z')
  )
  def score(str: String):Int = str.map(scoreLetter).sum
  def scoreLetter(char: Char):Int = values.filter(_._2.contains(char.toUpper)).head._1
}