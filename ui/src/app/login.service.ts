import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private resourceUrl = environment.apiUrl + "/login";

  constructor(private http: HttpClient) { }

  public login(loginData: any): Observable<any[]> {
    let response = new Observable<any>(s => {
      this.http.post(this.resourceUrl, loginData, { observe: 'response' }).subscribe(resp => {
        if (resp.status === 200) {
          s.next(resp.body);
        } else {
          s.next(false);
        }
      }, error => {
        s.next(false);
      });
    });
    return response;
  }
}
