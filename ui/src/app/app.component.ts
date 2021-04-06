import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { LoginService } from './login.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'App';
  loginForm: FormGroup;
  results: any[];

  constructor(private formBuilder: FormBuilder, private loginService: LoginService,private snackBar: MatSnackBar){
    this.loginForm = this.formBuilder.group({
      email: '',
      password: ''
    });
  }

  login() {
    this.results = null;
    this.loginService.login(this.loginForm.value).subscribe(result => {
      if (!result) {
        this.snackBar.open("Invalid credentials", 'Close', {
          duration: 3000
        });
      } else {
        this.results = result;
      }
    });
  }
}
