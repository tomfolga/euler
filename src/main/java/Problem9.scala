object Problem9 {

  def main(args: Array[String]) {
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000) {
    	if (a + b +c == 1000 && (a * a + b *b == c *c )) {
    		println (a*b*c)
    	}
    }
	  
  }
}