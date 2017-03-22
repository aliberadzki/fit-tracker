import {Component, OnInit} from '@angular/core';
import {WorkoutsService} from '../services/workout/workout.service'
import { Workout } from '../workout';

@Component({
  selector: 'workoutlist',
  templateUrl: './workoutlist.component.html',
  styleUrls: ['./workoutlist.component.css'],
  providers: [ WorkoutsService]
})
export class WorkoutlistComponent implements OnInit {
  newWorkoutName : string;
  workouts : Array<Workout> = [];
  errorMessage: string;

  constructor(private workoutService: WorkoutsService) {}

  ngOnInit() { this.getWorkouts(); }

  addWorkout() {
    this.workouts.push({
      id: this.workouts.length,
      title: this.newWorkoutName,
      complete:false
    });
    this.newWorkoutName = '';
  }

  deleteWorkout(index) {
    this.workouts.splice(index,1);
  }

  getWorkouts() {
    this.workoutService
      .getAllWorkouts()
      .subscribe(
        workouts => this.workouts = workouts,
        error => this.errorMessage = <any>error
      );

  }

}

