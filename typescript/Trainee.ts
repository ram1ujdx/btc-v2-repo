interface Trainee{
    traineeId:number;
    traineeName:string;
    email:string;

    showTrainee():void;

}

let trainee1:Trainee={
                        traineeId:101,
                        traineeName:"Gaurav",
                        email:"gaurav@yahoo.com",
                        showTrainee(){
                            console.log(this);
                        }
                        
                    };


                    trainee1.showTrainee();

