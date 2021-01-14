import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginData = {
    username:'',
    password:'',
  };

  constructor(private router: Router) { }

  ngOnInit(): void {
    if(sessionStorage.getItem('authenticated')==null){
      sessionStorage.setItem('authenticated','');
    }
    if(sessionStorage.getItem('authenticated')!=''){
      this.router.navigate(['']);
    }
  }

  login(){
    if(this.loginData.username == 'username' && this.loginData.password == 'password'){
      sessionStorage.setItem('authenticated',this.loginData.username);
      this.router.navigate(['']);
    }else{
      alert("Invalid username or password!");
    }
  }

}
