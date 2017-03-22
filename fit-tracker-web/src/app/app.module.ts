import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule, JsonpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';
import { RouterModule, Routes } from '@angular/router';
import 'hammerjs';

import { AppComponent } from './app.component';
import { WorkoutlistComponent } from './workoutlist/workoutlist.component';
import { WorkoutDetailsComponent } from './workoutdetails/workoutdetails.component';

const appRoutes: Routes = [
  { path: '',      component: WorkoutlistComponent },
  { path: 'workout/:id',      component: WorkoutDetailsComponent },
  {
    path: 'workouts',
    component: WorkoutlistComponent,
    data: {title: 'Heroes List'}
  },
];

@NgModule({
  declarations: [
    AppComponent,
    WorkoutlistComponent,
    WorkoutDetailsComponent
  ],
  imports: [
    RouterModule.forRoot(appRoutes),
    BrowserModule,
    FormsModule,
    HttpModule,
    JsonpModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
