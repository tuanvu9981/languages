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
exports.SmartPhone = exports.Device = void 0;
var Device = /** @class */ (function () {
    // class con kế thừa những thuộc tính protected
    function Device(name, version) {
        if (version === void 0) { version = "0.0.0"; }
        this.name = name;
        this.version = version;
    }
    Device.prototype.getInfo = function () {
        console.log("Device Name: ".concat(this.name));
        console.log("Device Version: ".concat(this.version));
    };
    return Device;
}());
exports.Device = Device;
var SmartPhone = /** @class */ (function (_super) {
    __extends(SmartPhone, _super);
    function SmartPhone(name, version, os) {
        if (version === void 0) { version = "0.0.0"; }
        if (os === void 0) { os = "Android"; }
        var _this = _super.call(this, name, version) || this;
        _this.os = os;
        return _this;
    }
    //override
    SmartPhone.prototype.getInfo = function () {
        console.log("SmartPhone Name: ".concat(this.name));
        console.log("SmartPhone Version: ".concat(this.version));
        console.log("SmartPhone OS: ".concat(this.os));
    };
    return SmartPhone;
}(Device));
exports.SmartPhone = SmartPhone;
var device = new Device("Laptop ASUS", "4.5.6");
device.getInfo();
var iphone = new SmartPhone("Oppo A3S", "3.4.6", "Android");
iphone.getInfo();
