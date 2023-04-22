// interview.model.ts

export class Interview {
    id: number;
    name: string;
    email: string;
    phone: string;
    skill: string;
    experience: string;
    date: string;
    time: string;
    link: string;
    hr: string;
    constructor (id:number, name:string, email:string,phone:string, skill:string, experience:string
        , date:string,time:string,link:string, hr:string) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone = phone;
        this.skill = skill;
        this.experience=experience;
        this.date=date;
        this.time=time;
        this.link=link;
        this.hr=hr;
    }


  }
  