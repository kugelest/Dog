val spielfeld = Array(1, 2, 3, 4)

class spieler(val name: String, val color: String, var pos: Int) {
  def move(x: Int): Unit = {
    pos = pos + x
  }
}
val spieler1 = new spieler("Peter", "blau", 0)
val spieler2 = new spieler("Mark", "rot", 0)

spieler1.name
spieler2.color

class karten(val name: String, val wert: Int)
val karteZwei = new karten("Zwei", 2)
val kartekDrei = new karten("Drei", 3)

spieler1.move(karteZwei.wert)
spieler1.pos
spieler1.move(kartekDrei.wert)
spieler1.pos

object field {
  def returnField(len: Int): String = {
    var s = "";
    s = s + "-" * (2 * len - 2) + "x"*len + "\n"
    for (i <- 2 to len) {
      s = s + "-" * (2 * len - 2) + "x" + " " * (len - 2) + "x" + "\n"
    }
    var k = 0;
    for (i <- 3 to len) {
      s = s + "-" * (2*len - i) + "x" + " " * (len + k) + "x" + "\n"
      k = k + 2
    }
    s = s + "x" * len + " " * (len + 2 * (len - 2)) + "x" * len + "\n"
    for (i <- 3 to len) {
      s = s + "x" + " " * (2 * (len-1) + 2 * (len - 2) + len) + "x" + "\n"
    }
    s = s + "x" * len + " " * (len + 2 * (len - 2)) + "x" * len + "\n"
    var l = len + 2*(len-3)
    for (i <- 0 to len-3) {
      s = s + "-" * (len + i) + "x" + " " * (l) + "x" + "\n"
      l = l - 2
    }
    for (i <- 2 to len) {
      s = s + "-" * (2 * len - 2) + "x" + " " * (len - 2) + "x" + "\n"
    }
    s = s + "-" * (2 * len - 2) + "x"*len + "\n"
    return s
  }
}

print(field.returnField(15))
