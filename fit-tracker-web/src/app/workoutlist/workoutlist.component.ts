import { Component } from '@angular/core';

@Component({
  selector: 'workoutlist',
  templateUrl: './workoutlist.component.html',
  styleUrls: ['./workoutlist.component.css']
})
export class WorkoutlistComponent {
  workouts: Array<Workout> = [];

  newWorkoutName : string;
  addWorkout() {
    this.workouts.push({title: this.newWorkoutName, complete:false});
    this.newWorkoutName = '';
  }

  deleteWorkout(index) {
    this.workouts.splice(index,1);
  }

}

interface Workout {
  title: string,
  complete: boolean
}
