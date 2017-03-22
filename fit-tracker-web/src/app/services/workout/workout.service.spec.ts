import { TestBed, inject } from '@angular/core/testing';

import { WorkoutsService } from './workout.service';

describe('WorkoutsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [WorkoutsService]
    });
  });

  it('should ...', inject([WorkoutsService], (service: WorkoutsService) => {
    expect(service).toBeTruthy();
  }));
});
