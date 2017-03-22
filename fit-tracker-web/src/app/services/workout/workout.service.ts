import { Injectable } from '@angular/core';
import {Observable} from "rxjs/Rx";
import { Workout } from '../../workout';

@Injectable()
export class WorkoutsService {

  constructor() { }

  getAllWorkouts() : Observable<Workout[]> {
    return Observable.of( this.dummyData );
  }

  getWorkout(index : number) : Observable<Workout> {
    return Observable.of(this.dummyData.find(item => item.id == index));
  }

  private dummyData : Array<Workout>  = [
      {id: 1, title: "Trening 1", complete: false},
      {id: 2, title: "Trening 2", complete: false},
      {id: 3, title: "Trening 3", complete: false},
    ];


}


