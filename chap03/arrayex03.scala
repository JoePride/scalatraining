val greetStrings = Array.apply("Hello", ", ", "world!\n")

for (i <- 0.to(2))
  print(greetStrings.apply(i))
