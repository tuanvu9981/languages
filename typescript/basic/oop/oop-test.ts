import { Device, SmartPhone } from "../oop/oop-2-inheritance/oop-2-inheritance";

let new_device = new Device("Macbook Pro 14", "3.3.3");
new_device.getInfo();

let new_smartphone = new SmartPhone("Iphone 14", "1.0.5", "IOS");
new_smartphone.getInfo()