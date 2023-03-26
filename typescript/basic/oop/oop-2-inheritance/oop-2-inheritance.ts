export class Device{
    protected name: string;
    protected version: string;
    // class con kế thừa những thuộc tính protected

    public constructor(name:string, version:string="0.0.0"){
        this.name = name;
        this.version = version;
    }

    public getInfo(){
        console.log(`Device Name: ${this.name}`);
        console.log(`Device Version: ${this.version}`);
    }
}

export class SmartPhone extends Device{
    private os: string;

    public constructor(
        name:string, 
        version:string="0.0.0",
        os:string="Android"){
        super(name,version);
        this.os = os;
    }

    //override
    public getInfo(): void {
        console.log(`SmartPhone Name: ${this.name}`);
        console.log(`SmartPhone Version: ${this.version}`);
        console.log(`SmartPhone OS: ${this.os}`);
    }
}

let device = new Device("Laptop ASUS","4.5.6");
device.getInfo();

let iphone = new SmartPhone("Oppo A3S", "3.4.6", "Android");
iphone.getInfo();

