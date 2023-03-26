class Payment{
    private payMethodName:string;
    private moneyAmount:number;
    private isCompleted:boolean;

    public constructor(payMethodName?:string, moneyAmount?:number, isCompleted?:boolean){
        if(payMethodName){
         this.payMethodName = payMethodName;
        }
        if(moneyAmount){
            this.moneyAmount = moneyAmount;
        }
        if(isCompleted){
            this.isCompleted = isCompleted;
        }
    }

    public getPayMethodName() : string {
        return this.payMethodName;
    }

    public getMoneyAmount() : number {
        return this.moneyAmount;
    }

    public getIsCompleted(): boolean{
        return this.isCompleted;
    }

    public setPaymentMethodName(payMethodName: string = "Default: Viettel Pay"): void{
        this.payMethodName = payMethodName;
    }

    public setMoneyAmount(moneyAmount:number = 0): void{
        this.moneyAmount = moneyAmount;
    }

    public setIsCompleted(completed:boolean = false): void{
        this.isCompleted = completed;
    }
    
    public announce(): void{
        console.log(`Pay Method Name: ${this.payMethodName}`);
        console.log(`Money Amount: ${this.moneyAmount}`);
        console.log(`Status: ${this.isCompleted}`);
    }   
}