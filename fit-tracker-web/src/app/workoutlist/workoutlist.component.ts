import { Component } from '@angular/core';

@Component({
  selector: 'workoutlist',
  templateUrl: './workoutlist.component.html',
  styleUrls: ['./workoutlist.component.css']
})
export class WorkoutlistComponent {
  newWorkoutName : string;
  workouts : Array<Workout> = [];


  addWorkout() {
    this.workouts.push({
      id: 0,
      title: this.newWorkoutName,
      complete:false
    });
    this.newWorkoutName = '';
  }

  deleteWorkout(index) {
    this.workouts.splice(index,1);
  }

  loadWorkouts() {
    this.workouts = [
      {id: 1, title: "Trening 1", complete:false},
      {id: 2, title: "Trening 2", complete:false},
      {id: 3, title: "Trening 3", complete:false},
    ];

  }

}

interface Workout {
  id: number,
  title: string,
  complete: boolean
}
