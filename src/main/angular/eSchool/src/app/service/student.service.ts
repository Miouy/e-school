import {Observable} from 'rxjs';
import {Student} from '../student';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseURL = "http://localhost:8080/students";

  constructor(private httpClient: HttpClient) { }

  getStudentList(): Observable<Student[]>{
    return this.httpClient.get<Student[]>(`${this.baseURL}`);
  }

  addStudent(student:Student): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`+`/add`,student);
  }

  deleteStudent(id:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/delete/${id}`);
  }

}
