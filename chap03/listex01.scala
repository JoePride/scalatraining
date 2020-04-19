val oneTwo = List.apply(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
val unDeuxTroixQuatre = oneTwo.:::(threeFour)

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")
println("Also, consider " + unDeuxTroixQuatre)
