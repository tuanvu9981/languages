"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var TV = /** @class */ (function () {
    function TV(name, manufacturer, madeAt) {
        if (madeAt === void 0) { madeAt = new Date('2019-04-06'); }
        this.name = name;
        this.manufacturer = manufacturer;
        this.madeAt = madeAt;
    }
    return TV;
}());
var ToshibaTV = /** @class */ (function (_super) {
    __extends(ToshibaTV, _super);
    function ToshibaTV() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.remoteControl = function (device) {
            console.log("");
        };
        return _this;
    }
    ToshibaTV.prototype.info = function () {
        console.log("TV Name: ".concat(this.name));
        console.log("TV manufacturer: ".concat(this.manufacturer));
        console.log("TV Made at: ".concat(this.madeAt));
    };
    ToshibaTV.prototype.showNews = function (newsName) {
        console.log("Showing news: ".concat(newsName));
    };
    ToshibaTV.prototype.showWeatherForecast = function (weather) {
        console.log("Today's weather is: ".concat(weather));
    };
    ToshibaTV.prototype.turnOn = function () {
        console.log("Turned On !");
    };
    ToshibaTV.prototype.turnOff = function () {
        console.log("Turn Off !");
    };
    return ToshibaTV;
}(TV));
var toshibaTV = new ToshibaTV("Toshiba 123", "Toshiba", new Date("2022-08-19"));
toshibaTV.info();
