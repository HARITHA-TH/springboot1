import { Component } from '@angular/core';

interface Interview {
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
}

@Component({
  selector: 'app-interview-scheduler',
  templateUrl: './interview-scheduler.component.html',
  styleUrls: ['./interview-scheduler.component.css']
})
export class InterviewSchedulerComponent {
  interviews: Interview[] = [];
  newInterview: Interview = {
    id: 0,
    name: '',
    email: '',
    phone: '',
    skill: '',
    experience: '',
    date: '',
    time: '',
    link: '',
    hr: ''
  };

  scheduleInterview() {
    this.interviews.push({...this.newInterview});
    this.clearForm();
  }

  deleteInterview(id: number) {
    this.interviews = this.interviews.filter(interview => interview.id !== id);
  }

  clearForm() {
    this.newInterview = {
      id: 0,
      name: '',
      email: '',
      phone: '',
      skill: '',
      experience: '',
      date: '',
      time: '',
      link: '',
      hr: ''
    };
  }
}
