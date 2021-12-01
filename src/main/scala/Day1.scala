@main def main() =
  val input = "day1".getInput.map(s => s.toInt)
  day1_1(input)

def day1_1(input: List[Int]): Unit =
  println(s"Day 1 - PART 1: ${input.zipWithIndex.count((e, i) => i > 0 && e > input(i - 1))}")

def day1_2(input: List[Int]): Unit =





