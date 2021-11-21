"use strict";
exports.__esModule = true;
exports.Person = void 0;
var Person = /** @class */ (function () {
    function Person(personId, personName, age) {
        this.personId = personId;
        this.personName = personName;
        this.age = age;
    }
    Person.prototype.showPerson = function () {
        console.log("ID : " + this.personId);
        console.log("Name : " + this.personName);
        console.log("Age : " + this.age);
    };
    return Person;
}());
exports.Person = Person;
