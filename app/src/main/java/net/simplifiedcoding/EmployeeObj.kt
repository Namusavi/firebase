package net.simplifiedcoding

class EmployeeObj{

    var employeename: String = ""
    var employeeContactNumber: String = ""
    var employeeAddress: String = ""

    constructor(employeename: String, employeeContactNumber: String, employeeAddress: String) {
        this.employeename = employeename
        this.employeeContactNumber = employeeContactNumber
        this.employeeAddress = employeeAddress
    }

    constructor()
}