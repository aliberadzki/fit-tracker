import { Component, OnInit } from '@angular/core';
import {WorkoutsService} from "../services/workout/workout.service";
import {Workout} from "../workout";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'workout-details',
  templateUrl: './workoutdetails.component.html',
  styleUrls: ['./workoutdetails.component.css'],
  providers: [ WorkoutsService]
})
export class WorkoutDetailsComponent implements OnInit {
  workout: Workout;

  constructor(
    private workoutService : WorkoutsService,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.loadWorkout(this.route.snapshot.params['id']);
  }

  loadWorkout(workoutId) {
    this.workoutService
      .getWorkout(workoutId)
      .subscribe(
        workout => this.workout = workout
      );
  }

}
