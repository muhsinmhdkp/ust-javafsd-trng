class Car{
    engine:string


constructor(engine:string)
{
    this.engine
}

disp():void{
    console.log("Function display Engine is : "+this.engine)
}
}

var obj = new Car("XXSY1")
console.log("reading attribute value Engine as "+obj.engine)
