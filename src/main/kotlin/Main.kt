fun main(args: Array<String>) {
    val emp1: Employee = Employee("Jane Doe", PositionTitle.ADMINISTRATION.returnString(), true, 27.00, 1)
    val emp2: Employee = Employee("Larry Jackson", PositionTitle.PRODUCTION.returnString(), false, 22.00, 2)
    val emp3: Employee = Employee("John Smith", PositionTitle.MAINTENANCE.returnString(), false, 21.00, 3)
    emp1.display()
    emp1.calculate(45)
    emp2.display()
    emp2.calculate(50)
    emp3.display()
    emp3.calculate(35)
}