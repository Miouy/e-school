import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  username:string = "";

  constructor(private router: Router) { }

  ngOnInit(): void {
    if(sessionStorage.getItem('authenticated')!='username'){
      console.log(sessionStorage.getItem('authenticated')+" |this");
      this.router.navigate(['/login']);
    }
  }

  logout(){
    sessionStorage.setItem('authenticated','');
    this.router.navigate(['/login']);
  }

}
