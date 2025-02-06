def call(){
   (1..20).each { number ->
    if (number % 2 == 0){
     echo "Even Number: $number"
    }
  }
}
