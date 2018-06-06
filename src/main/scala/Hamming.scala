object Hamming {
  def distance(a: String, b: String): Option[Int] = (a, b) match {
    case (a, b) if (a.length != b.length) => None
    case (a, b) => Some((a, b).zipped.count(c => c._1 != c._2))
  }

}
