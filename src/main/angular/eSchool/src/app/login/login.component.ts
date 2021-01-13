import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginForm = {
    username:'',
    password:''
  };

  constructor(private router: Router) { }

  ngOnInit(): void {
    sessionStorage.setItem('authenticated','');
  }

  login(){
    if(this.loginForm.username == 'username' && this.loginForm.password == 'password'){
      sessionStorage.setItem('authenticated',this.loginForm.username);
      this.router.navigate(['']);
    }else{
      alert("Invalid username or password!");
    }
  }

}
