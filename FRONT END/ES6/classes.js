class student{
    constructor(name,age){
    this.n = name
    this.a = age
    }
    stu(){
        console.log("The Name of the student is :", this.n)
        console.log("The Age of the student is ", this.a)
    }
}
var stuObj = new student('peter',20)
stuObj.stu()