var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine;
    }
    Car.prototype.disp = function () {
        console.log("Function display Engine is : " + this.engine);
    };
    return Car;
}());
var obj = new Car("XXSY1");
console.log("reading attribute value Engine as " + obj.engine);
