import {Component, OnInit} from '@angular/core';
import {FormControl, Validators} from '@angular/forms';
import {StudentService} from '../service/student.service';
import {Student} from '../student';
import {Router} from '@angular/router';
import {formatDate} from '@angular/common';


@Component({
  selector: 'app-add-dialog',
  templateUrl: './add-dialog.component.html',
  styleUrls: ['./add-dialog.component.scss']
})
export class AddDialogComponent implements OnInit {

  student: Student = new Student();

  ddd!:Date;

  hide = true;

  email = new FormControl('', [Validators.required, Validators.email]);

  getErrorMessage() {
    if (this.email.hasError('required')) {
      return 'You must enter a value';
    }

    return this.email.hasError('email') ? 'Not a valid email' : '';
  }

  value: string = 'Yes';

  constructor(private studentService: StudentService,
              private router: Router) {
  }

  ngOnInit(): void {
  }

  addStudent() {
    this.student.birthDate=this.ddd.getDate()+"/"+(this.ddd.getUTCMonth()+1)+"/"+this.ddd.getUTCFullYear();
    this.studentService.addStudent(this.student).subscribe(data => {
        console.log(data);
        this.goToStudentList();
      },
      error => console.log(error));
  }

  goToStudentList() {
    window.location.reload();
  }

  onSubmit() {
    console.log(this.student);
    this.addStudent();
  }

}
