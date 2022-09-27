class Employee constructor (private var name: String,
                            private var position: String,
                            private var salary: Boolean,
                            private var payRate: Double,
                            private var shift: Int) {

    fun display(){
        println("Name: $name \n" +
                "Position: $position \n" +
                "Is Salary?: $salary \n" +
                "Pay Rate: $payRate")
    }

    fun calculate(hoursIn: Int){
        var pay: Double = 0.0
        if (salary){ //salary pay, not sure which position has what salary so this will be the placeholder salary for now
            println("Pay this week: $1080.00 \n")
        } else {
            if (hoursIn > 40.0){ //overtime calculation
                payRate *= 1.5

            }
            if (shift == 2){ //checks shifts to see if the employee makes a bonus
                payRate *= 1.05
            } else if (shift == 3){
                payRate *= 1.1
            }

            pay = hoursIn * payRate
            println("Pay this week: $$pay \n")
        }
    }


}

