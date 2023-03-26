class Animal{
    name: string;

    constructor(name: string){
        this.name = name;
    }

    move(meters:number=0): void{
        console.log(this.name + " moved " + meters + " (m).");
    } 
}

let animal1 = new Animal("Bobby");
animal1.move(5);

let animal2 = new Animal("Helen");
animal2.move();

