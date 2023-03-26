import {Device} from "../oop-2-inheritance/oop-2-inheritance";

export abstract class TV{
    protected name:string;
    protected manufacturer:string;
    protected madeAt:Date;

    public constructor(name:string, manufacturer:string, madeAt:Date=new Date('2019-04-06')){
        this.name = name;
        this.manufacturer = manufacturer;
        this.madeAt = madeAt;
    }

    public abstract info():void;
}

export interface IShowable{
    showNews: (newsName:string) => void;
    showWeatherForecast: (weather: string) => void;
}

export interface IControl{
    remoteControl: (device: Device) => void;
    turnOn(): void;
    turnOff(): void;
}

export class ToshibaTV extends TV implements IShowable, IControl{

    public info(): void{
        console.log(`TV Name: ${this.name}`);
        console.log(`TV manufacturer: ${this.manufacturer}`);
        console.log(`TV Made at: ${this.madeAt}`);
    }

    public showNews(newsName: string){
        console.log(`Showing news: ${newsName}`);
    }

    public showWeatherForecast(weather: string){
        console.log(`Today's weather is: ${weather}`);
    }

    public remoteControl = (device: Device) => {
        console.log(``);
    }

    public turnOn(): void {
        console.log("Turned On !")
    }

    public turnOff(): void {
        console.log("Turn Off !");
    }
}

let toshibaTV = new ToshibaTV("Toshiba 123", "Toshiba", new Date("2022-08-19"));
toshibaTV.info(); 